#! /bin/bash

if [ -z $1 ]
then
    echo provide filenames
    read $FILENAMES
else
    FILENAMES=$@
fi

echo "Creating scripts: $FILENAMES"

for filename in $FILENAMES
do
  echo '#! /bin/bash' > $filename
  chmod +x $filename
done

exit 0
