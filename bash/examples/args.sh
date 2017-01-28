#! /bin/bash

echo "\$# gives $# - this is the count"
echo "\$@ gives $@ - this is an array"
echo "\$0 gives $0 - this is the first arg"
echo "\$* gives $* - this is a string of all args"
echo "\${@:2} gives ${@:2} - all args from 2 onwards as array"

for i in $@
do
    echo $i
done

for j in "${@:2}"
do
    echo $j
done



exit 0
