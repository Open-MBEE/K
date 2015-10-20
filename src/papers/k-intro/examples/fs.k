package examples.fs

BLOCK_SIZE : Int

type Byte = 
  {| b : Int :- 0 <= b && 
     b < 256 |}

class Entry {
  name : String
  fun size : Int
}

class Dir extends Entry {
  var contents : Set[Entry]
  fun size: Int {
    contents.collect(e -> 
      e.size()).sum() 
  }
}

class File extends Entry {
  contents : Seq[Block]
  req size() <= 
    contents.size() * 
      BLOCK_SIZE
}

class Block {
  bytes : Seq[Byte]
  fun size: Int { bytes.size() }
  req size() <= BLOCK_SIZE
}

class FS {
  dir : Dir

  fun mkDir(n: String) : FS 
    pre !exists 
      e : dir.contents :- 
          e.name = n
    post $result.dir.size() 
           = dir.size() 
  {
    newDir : Dir = Dir(name::n)
    nc : Set[Entry] = 
      dir.contents + newDir
    FS(dir:: 
      Dir(name::dir.name, 
        contents::nc))          
  }

  fun rmDir(n: String) : FS
    pre exists e : dir.contents :- 
          e.name = n
    post $result.dir.size() 
           <= dir.size()
}

