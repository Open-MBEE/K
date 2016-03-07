#!/bin/bash

# Example usage from OPENSOURCE GITHUB K folder:
#   ./export/sync2jpl.sh /c/Users/rahulku/S/Klang/

if [ -z "$1" ] 
then 
    echo "Please provide the target JPL GITHUB directory."
    exit -1
fi

echo "Syncing to $1..."

cp -r ./* $1/

echo ""
echo "Please cd $1"
echo "Please check the status of this (opensource) repository using 'git status'."
echo "During review, please ensure you add/delete files as needed."
echo "Once reviewed, you will need to commit and push."
echo ""

