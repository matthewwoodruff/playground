#! /bin/bash

echo Is the first arg present
test $1 && echo Yes

echo Is the first arg not present
test -z $1 && echo Yes

# other way to test (double brackets) note no spaces on either side of the ==
echo "First arg matches pattern"
[[ $1=='[a-z]*' ]] && echo Yes

exit 0

