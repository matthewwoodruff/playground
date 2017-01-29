#! /bin/bash

FILENAMES="$@"


if [[ $# -eq 0 ]]
then
    echo Please input some filenames
    read FILENAMES
fi

for filename in $FILENAMES
do
    echo $filename
done

exit(0)


