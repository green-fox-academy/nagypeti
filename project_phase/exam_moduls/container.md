## :books: Exam requirements on container: :whale:

Docker CE (Community Edition) & EE (Enterprise Edition)

Containers are a running instances of Images (containg: executables, dependencies, binaries, etc.)

**Containers vs. VM's:**

1. Containers are basically just the running process, the executable instance of the image.

2. Containers dont have any allocated hardware to it, like VM's.

3. Containers are virtualesing the host OS, while VM's are virtualesing the hardware.

### 1. Create image using Dockerfile

We can define the build process in a Dockerfile and then we can run _docker build_, to build the image based on the instructions specified in the Dockerfile.
```sh
docker build -t <image_name>:<tag_name> <location_of_dockerfile>
```
**_--no-cache_** - build without relying on cache from the last build </br>
**_-t, --tag_** - tagging the image with a name </br>
**_--rm_** - remove intermediate containers after a successful build </br>
**_-f, --file_** - we can give the path to another Dockerfile to build from </br>

#### Dockerfile instructions:

Dockerfiles are executed layer by layer, it means that every instruction is creating a new image, then executing the next instruction creates a new image.

**FROM** </br>
It defines the base image to use to start the build process. It is the first instruction in every Dockerfile.

**LABEL** </br>
We can write here almost anything in key=value format, for example version or vendor informations.

**ARG vs ENV** </br>
From Dockerfile reference: The ARG instruction defines a variable that users can pass at build-time to the builder with the docker build command using the --build-arg <varname>=<value> flag. </br>
The environment variables set using ENV will persist when a container is run from the resulting image.

**VOLUME** </br>
The VOLUME instruction should be used to expose any database storage area, configuration storage, or files/folders created by your docker container. You are strongly encouraged to use VOLUME for any mutable and/or user-serviceable parts of your image.

**WORKDIR**</br>
Set the workdir before executing RUN,CMD, ADD, COPY instructions.

**ADD / COPY** </br>
Although ADD and COPY are functionally similar, generally speaking, COPY is preferred. COPY only supports the basic copying of local files into the container, while ADD has some features (like local-only tar extraction and remote URL support). Consequently, the best use for ADD is local tar file auto-extraction into the image.

Because image size matters, using ADD to fetch packages from remote URLs is strongly discouraged; you should use curl or wget instead. That way you can delete the files you no longer need after they’ve been extracted and you don’t have to add another layer in your image.

```Dockerfile
ADD rootfs.tar.xz /.
```

If you have multiple Dockerfile steps that use different files from your context, COPY them individually, rather than all at once. This ensures that each step’s build cache is only invalidated (forcing the step to be re-run) if the specifically required files change.

**ENTRYPOINT & CMD** </br>
The exec form is where you specify commands and arguments as a JSON array. This means you need to use double quotes rather than single quotes.

```Dockerfile
ENTRYPOINT ["executable", "param1", "param2"]
```

Using this syntax, Docker will not use a command shell, which means that normal shell processing does not happen. If you need shell processing features, then you can start the JSON array with the shell command.

We have the CMD to run commands inside the container.

The main purpose of a CMD (Dockerfiles) / command (Docker Compose files) is to provide defaults when executing a container. These will be executed after the entrypoint.

In Dockerfiles, you can define CMD defaults that include an executable. For example:
```Dockerfile
CMD ["executable","param1","param2"]
```
If they omit the executable, you must specify an ENTRYPOINT instruction as well.
```Dockerfile
CMD ["param1","param2"] (as default parameters (command arguments) to ENTRYPOINT)
```
NOTE: There can only be one CMD instruction in a Dockerfile. If you list more than one CMD, then only the last CMD will take effect.

Docker recommends using ENTRYPOINT to set the image’s main command, and then using CMD as the default flags. Here is an example Dockerfile that uses both instructions.
```Dockerfile
FROM ubuntu
ENTRYPOINT ["top", "-b"]
CMD ["-c"]
```

**EXPOSE** </br>

We can set the port on which the container going to listen for connections.

### 2. Start / stop containers (using doom is ok :D)

We can start, stop and restart existing containers.

With run command we're going to run a new container all the time we hit run it's going to generate a new container.

**_-d, --detach_** - run in detached mode (in the background), without this flag we're going to see whats going on inside the container (like logs). </br>
**_-t, --tty_** - allocate a pseudo Terminal for the session, means TeleTYpewriter, we can open the terminal inside the container to work with, a virtual console.  </br>
**_-i, --interactive_** - means that we want to see the response from the terminal </br>

We can append -it arguments to docker run, so the container will run in interactive mode.
```sh
docker run -it --name <container_name> <image_to_run> <command>
#Example1: run a container named sping_app, using todo_spring_image
#and run bash command (linux terminal) inside.
docker run -it --name spring_app todo_spring_image bash
#Example2: create file inside the container using touch command
docker exec -it container_id touch /tmp/examplefile
```
### 3. Push and Pull from dockerhub

Version control management for docker images. We can use the images that are available on the dockerhub  for example mysql, apache, openjdk or more complex ELK Stack image.

Push process needs credentials for dockerhub. We have to tag the image as the following
```sh
<username>/<repository>:<tag>
```
### 4. Set environment variables and ports

**_-p, --publish_** - we can route traffic trough specific ports on host and container. Down we are exposing the 8080 port of the host machine (left side), and routing traffic of that port to the containers port of 8080 (right side) </br>
**_-e, --env_** - we can pass environment variables to docker at runtime, whit this option we're going to override the default value if the variable is already defined in the Dockerfile.

```sh
docker run --env username=whatthehell -p 8080:8080
```

### + Extras:

#### 1. :loudspeaker: Basic / useful docker commands and arguments:

###### Arguments:
**_--name_** - we can name the container when we run it for the first time. </br>

###### Commands:
**_docker_** _container_ **_logs <containername/id>_** - check the logs of a container. </br>
**_docker_** _container_ **_top <containername/id>_** - check the running processes inside of a running container. </br>
**_docker container ls -a_** - list all containers (other way _docker ps -a_) </br>
**_docker_** _container_ **_rm -f_** - remove container forced (remove even if running) </br>
**_docker_** _container_ **_inspect_** - details of the container in JSON format, it is useful to debug a container </br>
**_docker_** _container_ **_stats_** - resource comsumption of the running containers </br>

#### 2. Docker networking

Docker bridge service is creating a private network for containers, if we not defining any  network to use, its going to use the basic docker (bridge driver) network.

Containers on the same virtual network can communicate with each other easily, without any port given.

We can create different private networks for containers.

Docker network is using the DNS concept, we can refer to containers on the same networks by name.

Managing docker networks from CLI:

- **_docker network create <name>_** - Create virtual network
- **_docker network ls_** - List all the virtual networks that the docker engine knows
- **_docker network ls -f driver=bridge_** - List networks filtered with key=value pairs
- **docker network inspect <network_name>** - Provides details about network in JSON
- **docker network connect <network_name> <container_name>** - Connect container to network
- **docker network disconnect <network_name> <container_name>** - Disconnect from network
