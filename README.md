# SpringInitSetup
Initial setup for starting a Spring Boot project. Used Eclipse STS to setup the project.

For understanding what Spring does, look into dependency injection (dependency between classes):

https://www.tutorialsteacher.com/ioc/dependency-injection

Spring offers loosely coupled classes by watching over dependencies. Spring is an IoC container that create and manage the life time of objects. It also manages the dependencies between the classes.

The location of your HTML files should be directly put into the src/main/resources/templates folder. This is where Spring searches for templates by default.

This project includes H2 (integrated database), JPA (persistence framework communicating with the database), and Thymeleaf (communicates from backend to front end: known as a templating language).

For testing, JUnit is present in this project. It handles both unit testing and integration testing (using Hamcrest within its own framework). The testing files are located under src/test/java.

Notice how many folders there are before reaching the source code. This is because packages in Eclipse are made up of multiple folders (when you add a . in your package means that you are adding multiple folders to reach the file)

In case Eclipse STS does not recognize the packages and marks them at individual folders, you have to create a new source folder named "src/main/java", "src/main/resources", "src/test/java" and include all the source files that were in those directories into your new source folders. This way Eclipse STS will recognize your source files.
