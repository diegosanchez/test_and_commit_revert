#!/bin/sh

while(true); do
    n=5;
    git pull --rebase;
    git push;
    echo "Pusher - Sleeping $n sec..."
    sleep $n;
done;
