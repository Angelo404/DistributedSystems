#!/bin/bash

echo "clean build started..."
echo "removing prev classes..."
find -name "*.class" > classes.txt
rm $(<classes.txt)
echo "prev classes removed"
echo "now compiling..."
find -name "*.java" > java_sources.txt
sed -n '/test/!p' java_sources.txt > java_sources_clean.txt
javac -Xlint @java_sources_clean.txt
echo "compiling finsihed"
echo "removing temp files..."
rm classes.txt
rm java_sources.txt
rm java_sources_clean.txt
echo "temp files removed"
echo "clean build finished"




