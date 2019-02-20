## :books: Exam requirements on CI advanced: :star::loop::watch:

### 1. Create new Jenkins job

We can create different type of jobs, like freestyle jobs, pipelines, multibranch pipelines, etc.

Each of them are using almost the same elements:
- **SCM** - some source code managment tool to feed the codebase to the job. (We can add another locations to build the job from, but because of version control tools and their usage in the industry they are preferred)
- **Some build triggering mechanism** - webhooks, invoked with timed scripts, timing the builds with crontab or start them manually.
- **Build steps** - we have to define what to do in different situations (events) - run test? run build? dockerize? create the jar?
- **Deployment** - it's part of the build process, but it's worth to isolate from the build steps. We can talk about 3 stage of deployment:
  - _dev enviroment_ - inner usage, mostly for testing and checking the state of development process
  - _staging enviroment_ - staging environments test on a near-production level in a non-production environment
  - _production enviroment_ - needless to say, its the place of the final product :)

### 2. Configure GitHub hooks

Webhooks are basically HTTP requests made by the source site to the configured URL with specific information (payload) about the event what was triggering it.

##### Configure webhooks on GitHub:

  Example: http://195.228.147.126:9090/ghprbhook/  (pull_request and push) </br>
  - **_Payload URL:_** we can define the address to send the payload. The example is configured to send the payload to Jenkins, after the port that's the endpoint for the GitHub Pull Request Builder Plugin. </br>
  - **_Content type:_** we can choose data type of the payload, JSON is prefered. </br>
  - **_Secret:_** We can add a secret token, to make the communication between the two party more secure. </br>
  - **_Events:_** We can specify the events which going to trigger the webhook. (pull request, push, we can set literally any github event to trigger the hook)

##### Catching webhooks with CI/CD tools:

There are many options to catch the webhooks on server side: </br>
**Generic Webhook Trigger** - build job for webhooks - /generic-webhook-trigger/invoke </br>
**GitHub Pull Request Builder** - build job on pull request events - /ghprbhook/ </br>
**GitHub hook trigger for GITScm polling** - build job on any github event - /github-webhook/ </br>


### 3. Use deployment plugins or scripts

We can use Plugins, like AWS Elastic Beanstalk or write some script using AWS CLI tool, to deploy our application on different infrastructure.

My code examples:

Pipeline:
[Deploy with script using AWS CLI tool](https://github.com/green-fox-academy/todo_with_rds_deployed_with_pipline/blob/master/awsdeploy.sh) </br>
Freestyle job:
[Deploy with Jenkins Plugin](http://195.228.147.126:9090/job/Rueppellii%20-%20Practice/job/Peti-test/job/fs-job-with-helloworld-app/configure)
