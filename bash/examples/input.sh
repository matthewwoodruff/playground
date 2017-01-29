#! /bin/bash

echo "Type your name"

read NAME

echo "Your name is" $NAME

echo Type some words
read -a ARRAY

echo "All words will be in an array using the -a flag " $ARRAY

for word in $ARRAY
do
    echo $word
done
