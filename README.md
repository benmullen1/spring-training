# Spring Training Repository
These are all training exercises from the Udemy course titled
"Become Java Spring Boot Full Stack Developer. Learn Spring Framework, Spring Boot, Spring Data, Docker & AWS"


## Exercise 1
Related to the content in this repository:

[https://github.com/in28minutes/master-spring-and-spring-boot/tree/main/01-spring/learn-spring-framework-02/src/main/java/com/in28minutes/learnspringframework/examples/c1](https://github.com/in28minutes/master-spring-and-spring-boot/tree/main/01-spring/learn-spring-framework-02/src/main/java/com/in28minutes/learnspringframework/examples/c1)

That repository is the solution from the instructor, unfortunately. There is not a separate 'before' implementation, as far as I can tell.


The actual exercise is to implement a small Spring application with some beans
https://udemy.com/course/spring-boot-and-spring-framework-tutorial-for-beginners/learn/lecture/35020004


## Exercise 2
is not really an exercise, but a code-along following the concepts of the next section of the course
it is a spring-boot with rest API and a more elaborated version of the data layer from Exercise 1.

## Exercise 3 - JPA
Starting to work on JPA, though as yet it was only a Spring JDBC project with minimal JPA wiring.
Next module it should get the full Hibernate
[http://localhost:8080/h2-console](http://localhost:8080/h2-console) - H2 DB console, schema is coursedb and user is "user"

[http://localhost:8080/courses](http://localhost:8080/courses) - Lists all courses, a simple GET returns the list

[http://localhost:8080/course?name=1](http://localhost:8080/course?name=1) - returns the course with ID 1. ID is auto-generated value starting at 1 

PUT request: http://localhost:8080/course?name=Haskell+Training&author=Bibb+Ribb - this will insert this course name and author name into the DB. You will have to check the /courses page to see if it succeeded

