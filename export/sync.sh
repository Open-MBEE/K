#!/bin/bash

# Example usage from JPL GITHUB KLANG folder:
#   ./export/sync.sh /c/Users/rahulku/S/K/

if [ -z "$1" ] 
then 
    echo "Please provide the target OPEN SOURCE GITHUB directory."
    exit -1
fi

echo "Syncing to $1..."

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
cp README.md $1/README.md
cp src/k.el $1/src/k.el
cp build.xml $1/build.xml

# remove unwanted files
rm $1/src/examples/DSN_Pass.k
rm $1/src/examples/GravityScience.k
rm $1/src/examples/TrajectoryTimeline2.k
rm $1/src/examples/WSTS.k

echo ""
echo "Please cd $1"
echo "Please check the status of this (opensource) repository using 'git status'."
echo "During review, please ensure you add/delete files as needed."
echo "Once reviewed, you will need to commit and push."
echo ""

