## :books: Exam requirements on dataflow: :twisted_rightwards_arrows:

### 1. Layers (Layered architechture)

The most common development architecture.

Components within the layered architecture pattern are organized into horizontal layers, each layer performing a specific role within the app (e.g. presentation logic or business logic).

Components within a specific layer deal only with logic that pertains to that layer (single responsibility principle).
Each layer can have multiple components. Commonly used layers: Presentation, Business, Service, Persistance, Database. Layers can be combined (e.g. Business + Service).

### 2. Service

A Service class/interface provides a way of a client to interact with some functionality in the application.

This is typically a public layer. For example, a TicketingService interface might allow you to buyTicket, sellTicket, changeTicket and so on.

### 3. MVC

The Model-View-Controller (MVC) is an architectural (design) pattern that separates an application into three main logical components: the model, the view, and the controller. Each of these components are built to handle specific development aspects of an application.(=seperate responsibilities)

**The model** is responsible for managing the data of the application. It receives user input from the controller.

**The view** means presentation of the model in a particular format.

**The controller** responds to the user input and performs interactions on the model objects. The controller receives the input, optionally validates it and then passes the input to the model.

A layer can only communicate with a "neighbour" layer/component directly. If we ask for a data from the controller, the controller asks the service, the service the repo and the repo finally retrieves that data.

User sees the view --> makes request (uses the controller) --> based on the request the app goes to the controller --> then calls for a model (service, repository), after the job is done it returns --> it goes back to controller --> then it selects the new view.

In rest communication their is no view option, the controller returns the data after recieving it.


### 4. Joined models



### 5. Components

In Spring we can add @Component annotation on classes we want to add to the bean.

There are specific components as repository, controller, entity, service

### 6. DI, IoC

DI = Dependancy Injection, IoC = Inversion of Control. Important: DI is a form of IoC.

Dependency injection is a technique where one object supplies the dependencies of another object.

More info about DI at the expected skills.

Az IoC technika lényege, hogy a komponenskezelést (pl. létrehozást, példányosítást, paraméterezést, metódus hívás) kiemeljük a programkódból, és általában egy külső keretrendszerre bízzuk. (pl. Spring)

### Expected skills (3/4)

#### Able to identify separate responsibilities of the application

Suggestion: Prepare the repo of a project you've done during GreenFox (e.g. ToDo App). Show the different layers on that app (models, controllers, repository, how is data stored, helpers, etc.)

#### Able to explain how data is stored and used over the application

Same suggestion as in the previous question. Use an already ready app, where you show what kind of DB you are using (MongoDB, MsSql, MySql, etc.). Show the tables too in CLI (MySql) or in Visual Studio (MsSql).
C#: After this, how the DbContext, show how is it working, then go through the classes, where the data is "flowing through" when it is requested.
Http request -> Controller -> Service -> Repo -> GETS DA DATA (aka where the mAgIc happens), then the requested data is returned back to the user.

#### Able to demonstrate how to add new property to a model

C#: Open a model file and basic add it in one line- "public long Id { get; set; }" and you are done.
Java: First create a field like "private long id;" and based on that write getter and setter for the private field. The getter & setters will be the properties of the field.

#### Able to explain what dependency injection is and what problem it solves

The goal of dependency injection is to decouple objects to the extent that no client code has to be changed simply because an object it depends on needs to be changed to a different one.
The client (the class that want to use smth) delegates the responsibility of providing its dependencies to external code (the injector). The client is not allowed to call the injector code, just use it!
This is a very good practice, because this way, the client does not care what class it is using, as long as it is functional.
As a result, if the external code needs to be changed (e.g. we switch from CrudRepo to JPA) it can be done more easily and the changes have to modified in classes overall.
Further information here: https://en.wikipedia.org/wiki/Dependency_injection
