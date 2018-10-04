#!/bin/sh

while(true); do
    n=5;
    npm test && git commit -am working
    echo "Commiter - `date` - Sleeping $n..."
    sleep $n;
done
