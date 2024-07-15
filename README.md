# PetScreening
Code for my take home assessment for PetScreening

Code created using Java Spring Boot, GraphQL, and Maven that connect to a PostgreSQL database backend. 

First, make sure PostgreSQL is installed on your machine. Once that is complete and setup, run the queries notated in the sql files found in the project to create our database tables and to store some data inside of them. 

Download the zip file and unpack it. Next, open up your preferred IDE and import the project as an existing Spring Boot project. We need to edit the 'application.properities' file to change the information for our PostgreSQL connection. Change the user and password to your created profile in PostgreSQL. Run the command 'mvn clean install' to create the target file we will use to run the application. Once it has been built by Maven, we then run the application with 'com.example.PetScreening.PetScreeningApplication'. Once is has started running, head on over to 'http://localhost:8080/graphql' to verify a successful endpoint landing.

This is how you run the project. I recommend using some sort of IDE plugin or Google Chrome plugin to connect to the localhost url to better visualize the api endpoint and to type out the queries and mutations you would like to use. 
