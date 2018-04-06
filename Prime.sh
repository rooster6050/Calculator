#!/bin/bash

echo "Enter a number"
read num
i=2

while [ $i -lt $num ]
do
if [ `expr $num % $i` -eq 0 ]
then echo "Number is not prime, divides by $i"
exit
fi
i=`expr $i + 1`
done
echo "Your number is prime"
