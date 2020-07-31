 ![CI](https://github.com/dawood-dev/JavaMongo/workflows/CI/badge.svg)
 
 
 ![JavaMongo](/JavaMongo.png) 

<h1>About</h1>

Since most of the projects I have worked on are either on private repositories or under NDA I built this project as a sample of my work.

This is a Java based microservice application that provides RESTful end points that handle data requests for a MongoDB database. 

The database contains 2 main JSON collections from the [Sakila](https://dev.mysql.com/doc/sakila/en) dataset for a fictional DVD rental company. The Customers collection has information about the customers and their rentals, and the Films collection has information about the movies.

<h1>Architecture</h1>

The architecture for this application is based on best practices for microservices design. It is built using Micronaut, a Spring Boot compatible framework for developing Java microservices. The choice of Micronaut is motivated by its extreme speed and low memory footprint compared to other frameworks. This application is highly scalable because of its robust architecture and build. The application is written using very complex Java design patterns that allow improved abstraction and decoupling of objects. The application is easily extensible due to high levels of abstraction and decoupling. 

<h1>CI/CD</h1>

For Continuous Integration and Continuous Delivery I have configured a pipeline using state of the art tools such as Jenkins X, Google Cloud Platform, Nexus, Kubernetes, and Docker. In this pipeline releases are packaged automatically and promoted to the staging environment, then they can be promoted to production manually or automatically. Once Jenkins finishes build and creation of artifacts, they will be uploaded to the Nexus Repository Manager, which is extremely useful for team collaboration involving DevOps artifacts. ChartMuseum is also used as a Helm chart repository and Kubernetes orchestrates the entire pipeline hosted on GCP.

Jenkins Status: [jenkins.jx.34.125.92.143.nip.io](http://jenkins.jx.34.125.92.143.nip.io/job/dawood-dev/)

Nexus Repository Manager: [nexus.jx.34.125.92.143.nip.io](http://nexus.jx.34.125.92.143.nip.io/)

Kubernetes Dashboard: [Login](https://34.125.20.142/)
