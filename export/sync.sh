#!/bin/bash

if [ -z "$1" ] 
then 
    echo "Please provide the target OPEN SOURCE GITHUB directory."
    exit -1
fi


# copy export folder
cp -r ./export/* $1/export/

# copy lib folder
cp -r ./lib/* $1/lib/

# copy README.md
cp README.md $1/

# copy src/examples
cp -r src/examples/* $1/src/examples/

# copy src/grammar
cp -r src/grammar/* $1/src/grammar/

# copy src/k
cp -r src/k/* $1/src/k

# copy src/tests
cp -r src/tests/* $1/src/tests/

# copy src/web
cp -r src/web/* $1/src/web/

# copy other files in src/.
cp src/* $1/src/
