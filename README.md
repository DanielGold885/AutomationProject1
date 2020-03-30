# Automation Project

### This is an example of a test automation project written in Java

## Env pre conditions to running the project:
1. [JDK-8](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) installed and ```JAVA_HOME``` configured in the system env variables.
2. [MAVEN](https://maven.apache.org/download.cgi) installed and ```MAVEN_HOME``` configured in the system env variables.
3. MAVEN configured in system ```PATH```
4. Download [chromedriver](http://chromedriver.chromium.org/) (According to your chrome browser version).
5. Adding the chromedriver directory path to system ```PATH```
3. Clone project.
4. Open CMD -> navigate to the project level folder.
5. Execute ```$ mvn test```


## Project dependencies:
 
* To use the allure reporting server:
 Follow the installation instruction found in [this](https://docs.qameta.io/allure/) link.
 * To generate a run report open terminal -> 
 navigate to: {project level directory} -> 
 execute ```$allure serve ${directory name}```. i.e: ```$allure serve allure-results```
 
