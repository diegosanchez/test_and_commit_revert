#!/bin/sh

while(true); do
    git pull --rebase;
    git push;
    sleep 5;
done;
