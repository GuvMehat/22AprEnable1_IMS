Coverage: 74.5%
# Project Title

A Project using the Java language to create an IMS. Interliking the use of MySQL with JDBC to have a woeking .jar file which the user can use to manage their inventory. 

Link to Jira : https://guv-qa.atlassian.net/jira/software/projects/IMS/boards/2 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them, Download the correct edition for your computer operating system
Git Bash : https://git-scm.com/downloads
Java 16 : https://www.oracle.com/java/technologies/javase/jdk16-archive-downloads.html
Maven : https://maven.apache.org/download.cgi

```
Give examples
```

### Installing

A step by step series of examples that tell you how to get a development env running

1. Open Git Bash

2. In the Git Bash terminal go to the directory which contains the file.
	$ cd "   your file directory    "/22AprEnable1_IMS/

3. type in the code, this will generate the fat jar from the code. 
	$ mvm clean package

4. now go into the target folder 
	$ cd "   your file directory    "/22AprEnable1_IMS/target

3. using the command below run ims-1.0.0-jar-with-dependencies.jar file
	$ java -jar ims-1.0.0-jar-with-dependencies.jar


End with an example of getting some data out of the system or using it for a little demo

To add a customer folow the next steps
1- Type in "Customer"
2- Type in "Create"
3- Enter the desired first name
4- Enter the desired surname

Now to check if the customer has been added 
1- Type "Read" 
This should display the new customer that has been added


## Running the tests

To run the test open Git bash and enter the following line
	$ cd "   your file directory    "/22AprEnable1_IMS
		This will open the directory which contains all files

### Unit Tests 

This can be used to run Unit test
- To run all test
	$ mvn test
Running this in Git Bash will use the maven software to run all test which are in the file.

### Integration Tests 
Explain what these tests test, why and how to run them

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins
* **Gurveer Mehat** - *Addtional work* - [guvmehat](https://github.com/guvmehat

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

Many thanks to Richard Mansworth for helping me troubleshoot problems with the program and QA Acadamy for providing the training needed to complete the ims.

