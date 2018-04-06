#!/bin/bash

echo "input file name"
read fileName
if[ -e "$fileName" ] then
{
mv "$fileName" "$fileName".sh
chmod +x "$fileName".sh
}
