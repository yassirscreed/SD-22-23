# Solution to 3rd delivery

## Domain

Each server has a ReplicaManager, which implements gossip. Each user request passes through it.
The update log is mantained in the replica manager while the executed log is the ledger of the state.

## Concurrency

We try to make multiple concurrent balance queries to be able to execute at the same time.
