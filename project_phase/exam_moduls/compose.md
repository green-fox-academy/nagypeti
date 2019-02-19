## :books: Exam requirements on compose: :whale: :musical_score:

### 1. Using volumes

We can use volumes to make data persistent. Because containers cannot store data after the service (container) exited.

We can define volumes in many ways and we can mount volumes with running containers using --mount argument.

In compose files we can refer to volumes as seen below.

- On the left side we give the volume location on the host, currently . means local </br>
- The right side value is the volume on the container. If we're using images from dockerhub we can check the volumes defined for the image inside the Dockerfile of the image.

We can have as many volumes as we want. We can list them under each other.

```YAML
volumes:
  - .:/tmp
  - mysql-data:/var/lib/mysql
  - ./somefolder:/tmp
```

### 2. Using compose.yml

##### Why it is useful?
1. We can configure relationships between containers.
2. We can save docker container run settings in an easy-to-read file
3. Create one line developer enviroment SetUp

##### YAML (YAML Ain't Markup Language)
It is describing our "infrastructure" we want to create:
- Containers (services)
- Networks
- Volumes

The compose files has theirs own versions.
```YAML
version: '3'
```
Naming convention is to use Docker-compose.yml, but we can set the location of the .yml file with **_-f, --file_** argument.

Passing env variables to compose is possible through .env files.  

The usage example (explained with comments) of the compose.yml is below :arrow_down:

### 3. Start and stop containers

Set-up volumes/Nws and start all containers: </br>
**_docker-compose up_**
- We can use **_-d, --detach_** mode here as well

Stop all containers and remove cont/vol/NW: </br>
**_docker-compose down_**
Some arguments for compose down
- **_-rmi_** - remove the image built during compose up
- **_-v_** - remove locally created volumes

We can list out the processes which are running: </br>
**_docker-compose top_**

Show all running containers started wit compose: </br>
**_docker compose ps_**


### :pencil: Example .yml with description of different parts of it:
```YAML
# Version of docker-compose file
version: '3'

# Define the service (container) with the options below
services:
  # Name of the container, same as --name
  mysql-container:
    # Image we want to run
    image: mysql:5.6
    # Name of the container (overrides the naming above)
    container_name: mysql-container
    # The behaviour of the container
    restart: always
    # Passing n number of enviroment variables, same as -e (--env)
    environment:
      MYSQL_USER: hellouser
      MYSQL_ROOT_PASSWORD: 12345
      MYSQL_PASSWORD: 12345
      MYSQL_DATABASE: hello_db
    # On which port should the container listens for connections
    expose:
      - 3306
    # Volume what we can mount to host side folder, same as -v
    # Left side value is the volume on the host, right is the volume on the container
    volumes:
      - mysql-data:/var/lib/mysql

  # Name of the container, same as --name
  hello-gradle-container:
    # Calling docker build on the local Dockerfile, before we use the image after
    build:
      # It means where we want to build the image
      context: .
      # location of the Dockerfile
      dockerfile: Dockerfile
    # Image we want to run
    image: hello-gradle-base-image
    # Name of the container (overrides the naming above)
    container_name: hello-gradle-container
    # We can override the basic command written in the Dockerfile
    # It has the same syntax, as in the Dockerfile
    command: ["executable", "with", "some", "-argument",]
    # Passing n number of enviroment variables, same as -e (--env)
    environment:
      JDBC_DATABASE_URL: jdbc:mysql://mysql-container:3306/hello_db
      JDBC_DATABASE_USERNAME: hellouser
      JDBC_DATABASE_PASSWORD: 12345
    # Defining the dependency of the containers, with this we can tell,
    # that this container need the mysql container, so pls run that before this.
    depends_on:
      - mysql-container
    # On which port should the container listens for connections, same as -p (--publish)
    # Left side is the host port, right side is the container port
    ports:
      - 8080:8080
    # Volume what we can mount to host side folder, same as -v
    # Left side value is the volume on the host, right is the volume on the container
    volumes:
      - .:/tmp
    # It's for we can exec the container with -t flag
    tty: true

# We are creating the volume locally for the mysql container
volumes:
  mysql-data

# Create networks here, then add line --> networks: -nameOfNetwork to the service
networks:

```
