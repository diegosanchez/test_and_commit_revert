#!/bin/sh

while(true); do
    n=5;
    npm test && git add . && git commit -am working
    echo "Commiter - `date` - Sleeping $n..."
    sleep $n;
done
