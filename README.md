# JSON_File_Parser
This application is used  to parse a json file and pretty prints the result using a java servlet
- This application was written using the Java language. It runs on the gradle platform (gradle 5.0)
- The application uses the jackson library (2.0.1) to  serialize and deserialize the json objects
- The application makes use of gretty, this makes it possible to call the servlets from a browser / rest client
   by running tomcatRunWar
  
- Uses java servlet to return the pretty print version of the address objects
- The address types and country codes have been represented as enumarations

- once project has been successfully cloned, under the  intellij terminal ( or terminal in the project root directory ) run gradle clean build.
- if you dont have gradle installed , please install gradle version 5.
- once successfully built, run "tomcatRunWar" and you should see  http://localhost:8081/JSON_File_Parser under the console.

- the different sections of the assessment were implemented on their own servlet

a) pretty printing all addresses  from file with validation  http://localhost:8081/JSON_File_Parser/parseAllAddresses
b) print address from file http://localhost:8081/JSON_File_Parser/parseSingleAddress
c) print type of address http://localhost:8081/JSON_File_Parser/parseAddressType

