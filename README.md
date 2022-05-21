<h1 align="center"> TestVagrant Assignment 👋</h1>
<p>
</p>

## Description
> This project is a Test automation framework built for Api testing using rest assured library. 
> Tools used include 
  - Java: Programming language
  - Maven: Build Automation tool
  - Rest Assured: Java library for testing Restful Web services
  - TestNG: Testing framework
  - AssertJ: Assertion library
  - Java Faker: External library used to generate test data
  - Jackson-Databind: used to convert JSON to and from POJO
  - Lombok: External Library used to reduce boilerplate code
  - Docker: To run our automated tests as Docker images

## Approach used to construct Json Object
- Used pojo classes to construct json object
- Player pojo class for the 'Player' type
- TeamRcb pojo class for the 'TeamRcb' type
- Used lombok annotations @Builder and @Getter to reduce boilerplate code
- And Atlast a factory class 'TeamFactory' with 'createTeamRcb' factory method to supply our json object with the help of pojos.

## How To Use It
- Fork this project to your github account.
- Clone the repository to your local workspace.
- Change the baseuri and pathparam values in config.properties file based on your endpoint under test.
- Write your GET, POST, DELETE request tests in src/test/java.
- Run the testng.xml file.

## Author
👤 **Muralikrishnan Ganesan**

* Github: [@muralikrishnan5971](https://github.com/muralikrishnan5971)
* LinkedIn: [@muralikrishnan-ganesan](https://linkedin.com/in/muralikrishnan-ganesan)

## Show your support

Give a ⭐️ if this project helped you!
