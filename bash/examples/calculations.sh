#! /bin/bash

# calculations can be done internally
echo $((1 + 1))

# or externally for better accuracy
echo $(echo 'scale=3; 10/3' | bc)

# using heredoc

bc <<CALC 
scale=3; 10/3 
CALC
