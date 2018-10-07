# test && commit || revert

[Medium article](https://medium.com/@kentbeck_7670/test-commit-revert-870bbd756864)

[What we are doing?](https://medium.com/@kentbeck_7670/limbo-on-the-cheap-e4cfae840330)

# Clock explanation

http://www.3quarks.com/en/BerlinClock/

# test and commit revert

Running commiter: ```sh commit_forever.sh```

Running pusher: ```sh push_forever.sh```

## Nelson's personal thoughts

1. It's better to add files, instead of edit, to avoid merge conflict.
2. You have to agree a `design` and a `contract` before start, because any programmer could take a separate way.
3. You won't be allowed to skip some tests to reduce the time to execute, because it maybe will push some breaking changes.
4. This technique will `commit & push` your changes on the green step of TDD, without the refactor needed. Not issue at all because it could be done trough next iteration.

## Diego's experiences (avoiding replication)

1. It fosters UTDD instead of ATDD and it might cause [gold plating](https://en.wikipedia.org/wiki/Gold_plating_\(project_management\)) effect.
2. It prevents running integration test which are by definition time consuming. 



## Conclutions

I think that it's a technique that requires working synchronously, like pair programming on many computers.
