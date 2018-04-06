#!/bin/bash
if [ -e log.txt ]; then 
w > log.txt
else
echo "should overwrite existing log? Y/N"
read reply
if [ $reply=Y ]; then 
w > log.txt

fi
fi
