#! /bin/bash

echo "\$# gives $# - this is the count"
echo "\$@ gives $@ - this is an array"
echo "\$0 gives $0 - this is the first arg"
echo "\$* gives $* - this is a string of all args"
echo "\${@:2} gives ${@:2} - all args from 2 onwards as array"

echo Printing array
for i in $@
do
    echo "$i"
done
echo

echo Printing array string
for a in "$@"
do
    echo "$a"
done
echo

echo Printing select arguments
for j in "${@:2}"
do
    echo $j
done



exit 0
