# :books: maven, gradle, ant

**Build Managment Tools designed for Java projects**

# MAVEN
POM.xml is used by maven, Project Object Model it contains information about the project and configuration details.

Starting a project - maven archetype:generate - generates a basic architecture from project templates created by apache developers.
There are many tamplates availabe, we can choose them by numbers.

_groupId_ - naming convention is site of your organizations page reversed _com.greenfoxacademy </br>
_artifactId_ - representing the name of the project </br>
_version_ - basic varsion is 1.0-SNAPSHOT </br>
_package_ - its the group id, then some name com.greenfoxacademy.demoproject

**maven build lifecycle** - the commands are connected, for example for deploy, all the commands before going to be executed by maven. </br>
----------->------------->----->------------->----------------------->-------->--------->----------> </br>
**validate, compile, test, package, integration-test, verify, install, deploy**

**mavenrepository** - storing created artifacts/jar files for build tools

**Transitive dependencies** - they are dependencies of the dependencies we are adding to the project. </br> For example H2 DB has a lot of dependencies, we can check the pom.xml file of the dependency to check which dependencies does it using.

**Excluding dependencies** (gruopId and artifactId needed) - inside the dependency declaration, there is an option called exclusions, and the exclusion.

**Scopes** - we can declare which of our source files going to use the dependency. The are many predefined scopes, like test, compile, provided, runtime. These scopes are important when we are developing API's.

Example xml for dependencies:
- we are excluding the logging service under hibernate, let say we want to use another logging service
- we are limiting the scope of jUnit dependency for _test_ source files.

```XML
  <dependencies>
    <dependency>
      <groupId>org.hibernate</groupId>
      <artifactId>hibernate-core</artifactId>
      <version>3.6.3.Final</version>
      <exclusions>
        <exclusion>
          <groupId>org.jboss.logging</groupId>
          <artifactId>jboss-logging</artifactId>
        </exclusion>
      </exclusions>
    </dependency>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
```

# Gradle
Mostly used for android projects :)
