This project contains two different Maven modules.  One is the one that contains all of the shared web resources and the other depends on it and is the actual deployable web-app.

## Blog Post
If you wish to read about this demo, visit our blog post [here](http://nerdwin15.com/2013/04/sharing-web-resources-using-maven/).

## Running
-  Download the entire repository
-  Run **mvn clean install** on the **shared-resources** module
-  Run **mvn clean install** on the **resource-server** module
-  Copy the war file from resource-server/target into your Tomcat instance (in the webapps directory)
-  Start up Tomcat
-  Point your browser to your instance
-  See your resources pulled in!
