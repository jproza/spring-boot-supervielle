# spring-boot-crud-supervielle

Desafio Supervielle (**C**reate, **R**ead, **U**pdate, **D**elete) api-rest spring boot y H2 in-memory base de datos.

La Api Rest esta deployada en Heroku server, todos sus endpoints disponibles en: 
## [https://spring-boot-supervielle.herokuapp.com/](https://spring-boot-supervielle.herokuapp.com/)



## Prerequisitos 
- Java
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/guides/index.html)
- [H2 Database](https://www.h2database.com/html/main.html)
- [Lombok](https://objectcomputing.com/resources/publications/sett/january-2010-reducing-boilerplate-code-with-project-lombok)
- Debe instalarse lombok - uso: java -jar lombok-1.18.12.jar


## Herramientas utilizadas en el proyecto
- Eclipse or IntelliJ IDEA (or any preferred IDE) with embedded Maven
- Maven (version >= 3.6.0)
- Postman - Collections
- java -jar lombok-1.18.12.jar


<br/>


###  Como ejecutar la API:
_GOTO >_ **~/absolute-path-to-directory/spring-boot-supervielle**  
y ejecutar el siguiente comando:
> **```mvn spring-boot:run```** inicializa la spring boot application

o
> **```mvn clean install```** buildea la aplicacion y crea el **jar** file en el directorio /target 

Como ejecutar el jar:
> **```java -jar ~/spring-boot-supervielle/target/spring-boot-supervielle-0.0.1-SNAPSHOT.jar```**

o
> Ejecutar la siguiente clase con cualquier IDE de desarrollo: `SpringBootSupervielleCRUDApplication.java` como aplicacion spring boot .  



| **_Nota_** : En `SpringBootSupervielleCRUDApplication.java` | se inicializa la api con datos de ejemplo al iniciar
la ejecucion de la API.| 


   
   
1. #### Propertie file
    Archivo de conf. en :  **application.properties** 

    **src/main/resources/application.properties**
     ```
     server.port=${PORT:5000}
    
     spring.datasource.url=jdbc:h2:mem:sampledb
     spring.datasource.driverClassName=org.h2.Driver
     spring.datasource.username=sa
     spring.datasource.password=password
     spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    
     spring.h2.console.enabled=true
    
     spring.data.rest.base-default-page-size=10
     spring.data.rest.base-max-page-size=20
    
     springdoc.version=1.0.0
     springdoc.swagger-ui.path=/swagger-ui-custom.html 
     ```
