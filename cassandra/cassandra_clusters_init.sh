#!/bin/bash

docker stop cassandra0
docker rm cassandra0

docker run --name cassandra0 -d \
-e HEAP_NEWSIZE=1M \
-e MAX_HEAP_SIZE=1024M \
-v /var/www/cassandra:/var/lib/cassandra \
-p 0.0.0.0:9043:9042 \
-e CASSANDRA_CLUSTER_NAME="SpaceShip" \
-d cassandra:latest

docker stop cassandra1
docker rm cassandra1

docker run --name cassandra1 -d \
-e HEAP_NEWSIZE=1M \
-e MAX_HEAP_SIZE=1024M \
-p 0.0.0.0:9044:9042 \
-e CASSANDRA_SEEDS="$(docker inspect --format='{{ .NetworkSettings.IPAddress }}' cassandra0)" \
-e CASSANDRA_CLUSTER_NAME="SpaceShip" \
-d cassandra:latest

docker stop cassandra2
docker rm cassandra2

docker run --name cassandra2 -d \
-e HEAP_NEWSIZE=1M \
-e MAX_HEAP_SIZE=1024M \
-p 0.0.0.0:9045:9042 \
-e CASSANDRA_SEEDS="$(docker inspect --format='{{ .NetworkSettings.IPAddress }}' cassandra0)" \
-e CASSANDRA_CLUSTER_NAME="SpaceShip" \
-d cassandra:latest


#posmotret` vse zaptshenie cassandri
#docker ps

#cqlsh k koncretnoy cassandre 0<=N<=2
#docker exec -ti cassandraN cqls

#posmotret` sostoyanie clustera
#docker exec -ti cassandra0 nodetool status