#!/bin/sh

while(true); do
    n=5;
    mvn test && git commit -am working
    echo "Commiter - Sleeping $n..."
    sleep $n;
done
