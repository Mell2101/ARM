# Use the official Tomcat base image
FROM tomcat:9.0-jdk11-openjdk

# Copy the WAR file to the webapps directory of Tomcat
COPY target/credit-manager-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/credit-manager.war

# Expose Tomcat port
EXPOSE 8080
