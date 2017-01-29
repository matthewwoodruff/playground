#! /bin/bash

function cleanup {
    echo "Executing cleanup"
}

trap cleanup EXIT

echo "Starting script"

echo "Blowing up!!!"

exit 3

echo "Ending script"


