#! /bin/bash

PATH=/usr/bin/bash

# # matches from the beginning
# ${VAR#pattern} Delete the shortest matching part and return the rest
echo ${PATH#*/} # prints usr/bin/bash

# ${VAR##pattern} Delete the longest matching part and return the rest
echo ${PATH##*/} # prints bash


# % matches from the end
# ${VAR%pattern} Delete the shortest matching part and return the rest
echo ${PATH%/*} # prints /usr/bin

# ${VAR%%pattern} Delete the longest matching part and return the rest
echo ${PATH%%/*} # prints nothing!! :)
