# SpringInitSetup
Initial setup for starting a Spring Boot project

For understanding what Spring does, look into dependency injection (dependency between classes):

https://www.tutorialsteacher.com/ioc/dependency-injection

Spring offers loosely coupled classes by watching over dependencies. Spring is an IoC container that create and manage the life time of objects. It also manages the dependencies between the classes.

The location of your HTML files should be directly put into the src/main/resources/templates folder. This is where Spring searches for templates by default.

This project includes H2 (integrated database), JPA (persistence framework communicating with the database), and Thymeleaf (communicates from backend to front end: known as a templating language).

For testing, JUnit is present in this project. It handles both unit testing and integration testing (using Hamcrest within its own framework). The testing files are located under src/test/java.
