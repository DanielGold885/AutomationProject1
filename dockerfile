# Use the latest image from UBUNTU installed in the machine
FROM ubuntu:latest

MAINTAINER corefinder@docker.com

# Update ubuntu system
RUN apt-get update

# Install java version on ubuntu-selenium image
RUN apt-get install -y default-jdk
RUN apt-get install -y default-jre

# Install maven on ubuntu-selenium image
RUN apt-get install -y maven

# Install git on ubuntu-selenium image
RUN apt-get install -y git

# Get the repository onto the local system
RUN git clone https://github.com/DanielGold885/AutomationProject.git

# Run the maven command to execute all the tests
WORKDIR "/AutomationProject"
RUN mvn clean install test

ENTRYPOINT ["/bin/bash"]

