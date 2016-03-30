RestEasy-Spring-Hibernate
--------------------------

GET:
---
http://localhost:8080/RestEasy-Spring-Hibernate/resteasy/customerservice/getallcustomer

Content-Type: application/x-www-form-urlencoded
Accept: application/json

Content-Type: application/x-www-form-urlencoded
Accept: application/xml



GET By Id
---------
http://localhost:8080/RestEasy-Spring-Hibernate/resteasy/customerservice/getcustomer/1


Content-Type: application/x-www-form-urlencoded
Accept: application/json

Content-Type: application/x-www-form-urlencoded
Accept: application/xml


POST:
-----
http://localhost:8080/RestEasy-Spring-Hibernate/resteasy/customerservice/addcustomer

Accept : application/x-www-form-urlencoded
Content-Type : application/json

{
  "customerid":11,
  "name" : "Karthick",
  "age": 24
}


POST:
------

<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<CustomerType xmlns="http://benchresources.in/cdm/Customer">
    <customerId>12</customerId>
    <name>Shoaib</name>
    <age>32</age>
</CustomerType>

Content-Type: application/xml
Accept: application/x-www-form-urlencoded

Response: Customer information saved successfully with Customer_ID 12


Reference URL:
--------------
http://www.benchresources.net/resteasy-jax-rs-web-service-integrating-with-spring-and-hibernate-orm-framework/
 