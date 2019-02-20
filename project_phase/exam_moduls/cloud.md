## :books: Exam requirements on cloud: :cloud::globe_with_meridians:

**Cloud computing:**

Cloud computing is an IT paradigm which enables ubiquitous access to shared pools of resources such as networking, compute power, storage, applications, and services. For it to be completely ubiquitous all of these resources need to be accessible over the internet and configurable via an API.


### 1. Deploy to EBS

We have to choose a pre-configured enviroments provided by AWS (we can create our own too).
  - Docker, Java, .Net, Python, Rails, Node.js and so on.

We can set environment variables. </br>
We can add RDS instance to the EBS. </br>
We can create/choose security groups for the EBS. </br>

For example with Docker-env every time when we upload a Dockerrun.aws.json file, then the EBS going to order the EC2 to run a docker pull from our repository, then run the image from the updated image.

### 2. Manage EBS of EC2 instance

We can manage our EBS in Configuration under the ElasticBeanstalk console tool.

Here we have the option to set/change (if possible) the services that our EBS are using or can use.

We can SSH into the EC2 which runs our application, to execute install/execute/start/stop/delete anything just like on our computer.

### 3. Push files to S3

Cloud based storage (bucket) solution from AWS.

There are many options to copy files to remote storage:
- upload manually on console
- copy it using AWS CLI tool
- copy it after configuration with terraform

### Manage an RDS instance

Relational Database Service (RDS) makes it easy to set up, operate, and scale a relational database in the cloud. It provides cost-efficient and resizable capacity while automating time-consuming administration tasks such as hardware provisioning, database setup, patching and backups.

AWS RDS offers a cloud based relational database available with six familiar database engines.

- Amazon Aurora, MySQL, Microsoft SQL Server, PostgreSQL, MariaDB and Oracle

We can remote access the RDS with any locally installed SQL engine client, like MySQL client.


### + Extra stuff about AWS services and more:

**Elastic Beanstalk:**

AWS Elastic Beanstalk is an easy-to-use service for deploying and scaling web applications and services developed with Java, .NET, PHP, Node.js, Python, Ruby, Go, and Docker on familiar servers such as Apache, Nginx, Passenger, and IIS.

We can simply upload our code and Elastic Beanstalk automatically handles the deployment, from capacity provisioning, load balancing, auto-scaling to application health monitoring.

ELB manages all the upper services automatically.

**VPC (Amazon Virtual Private Cloud)**

We can provision a logically isolated section of the AWS Cloud where we can launch AWS resources in a virtual network that you define.

VPC is short for Virtual Private Cloud and allows you to build a virtualized private network inside of AWS complete with subnets, NAT gateways, VPN connections, routing tables, security groups and much more. Everything you expect to have inside of your own data centre is right there in AWS.

All of the running services are allocated to a VPC.

**SSH**

SSH, or Secure Shell, is a remote administration protocol that allows users to control and modify their remote servers over the Internet. The service was created as a secure replacement for the unencrypted Telnet and uses cryptographic techniques to ensure that all communication to and from the remote server happens in an encrypted manner. It provides a mechanism for authenticating a remote user, transferring inputs from the client to the host, and relaying the output back to the client.
