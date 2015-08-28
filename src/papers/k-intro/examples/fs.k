package examples.fs

SIZE_OF_BLOCK : Int

type Byte = {| b : Int :- 0 <= b && b < 256 |}


class Entry {
  name : String
  fun size : Int
}

class Dir extends Entry {
  var contents : Set[Entry]
  fun size: Int {
    contents.collect(e -> e.size()).sum() 
  }
}

class File extends Entry {
  contents : Seq[Block]
  req size() <= contents.size() * SIZE_OF_BLOCK
}

class Block {
  bytes : Seq[Byte]

  fun size: Int { bytes.size() }
  req size() = SIZE_OF_BLOCK
}

class FileSystem {
  dir : Dir

  req fileSystem.size() <= 1000

  fun mkDir(n: String) : FileSystem 
    pre !exists e : dir.contents :- e.name = n
    post $result.dir.size() = dir.size()
  {
    FileSystem(dir :: dir + Dir(name :: n))          
  }

  fun rmDir(n: String) : FileSystem
    pre exists e : dir.contents :- e.name = n
    post $result.dir.size() <= dir.size()
}

fileSystem : FileSystem

