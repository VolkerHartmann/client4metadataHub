# Client for MetadataHub

Simple example client for metadata hub.

# Setup Test framework using Docker
## Requirements:
- Docker (MetaStore)
- Git
- Java JDK8 or higher (MetadataHub, Client4MetadataHub)


## Setup and Start MetaStore
Start a container for executing microservice. First adapt settings for service:
```
# Create folder for MetaStore and configuration file:
user@localhost:/home/user/$ mkdir -p metastore/config
user@localhost:/home/user/$ cd metastore/config
user@localhost:/home/user/metastore/config/$
```
Add the following file 'application.properties':
```
repo.messaging.enabled: false
###############################################################################
# Disable Cross-Site-Request-Forgery (NOT RECOMMENDED for PRODUCTION MODE)
###############################################################################
metastore.security.enable-csrf=false
metastore.security.allowedOriginPattern=http[*]://localhost:[*]
```
Start docker service:
```
user@localhost:/home/user/metastore/config/$cd ..
user@localhost:/home/user/metastore2$ docker run -d -p8040:8040  -v `pwd`/config:/spring/metastore2/config --name metastore4docker kitdm/metastore2
user@localhost:/home/user/metastore2$docker ps
CONTAINER ID   IMAGE              COMMAND           CREATED          STATUS          PORTS                                       NAMES
778616c7c5ca   kitdm/metastore2   "bash ./run.sh"   54 seconds ago   Up 52 seconds   0.0.0.0:8040->8040/tcp, :::8040->8040/tcp   metastore4docker
user@localhost:/home/user/metastore2$
```
### Stop Docker Container
Clone repo and run 
```
user@localhost:/home/user/metastore2$ docker stop metastore4docker
```

### (Re)start Docker Container
If you want to (re)start container just type
```
user@localhost:/home/user/metastore2$ docker start metastore4docker
```

## Build and Setup MetadataHub
First you have to clone the repository.
```
user@localhost:/home/user/$git clone https://github.com/VolkerHartmann/metadataHub.git
user@localhost:/home/user/$cd metadataHub
user@localhost:/home/user/metadataHub$ mkdir config
user@localhost:/home/user/metadataHub$ cp src/main/resources/config/DoipConfiguration.json config 
```
Edit 'config/DoipConfiguration.json' due to your needs. You have to change the following values:

```
[...]
"listenAddress": "localhost",
"port": 8880,
[...]
"serviceId": "35.TEST/DOIPServer",

```

### Start MetadataHub
To start the server just type:
```
user@localhost:/home/user/metadataHub$ ./gradlew run
```

### Adapt MetadataHub for another Service
Right now MetadataHub supports only one mapping at a time. To set up a new mapping
edit the file 'mappings/example_mappings.json' accordingly to your needs.

## Build and Setup Simple Test Client for MetadataHub (MetaStore)
First you have to clone the repository.
```
user@localhost:/home/user/$git clone https://github.com/VolkerHartmann/client4metadataHub.git
user@localhost:/home/user/$cd client4metadataHub
```
Edit 'src/main/java/edu/kit/turntable/doipclient/Main.java' due to your needs. 
```
[...]
"listenAddress": "localhost",
"port": 8880,
[...]
"serviceId": "35.TEST/DOIPServer",

```

### Run Test Client for MetadataHub
To start the server just type:
```
user@localhost:/home/user/client4metadataHub$ ./gradlew run
```

# Links
- [DOIP Specification] (https://www.dona.net/sites/default/files/2018-11/DOIPv2Spec_1.pdf)
- [DOIP SDK] (https://www.dona.net/sites/default/files/2020-09/DOIPv2SDKOverview.pdf)
- [Turntable API](https://volkerhartmann.github.io/turntable/)