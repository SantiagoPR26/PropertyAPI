# PropertyCrud

Este proyecto es una prueba técnica desarrollada utilizando Java Spring Boot y H2. La arquitectura utilizada sigue el patrón de arquitectura hexagonal, con capas de repositorio, servicio y aplicación para una estructura modular y escalable.
Requisitos Previos

    Java JDK 17 o superior instalado en tu sistema.
    Maven para compilar y ejecutar el proyecto.

Configuración

    Clona este repositorio en tu máquina local.
    Abre el proyecto en tu IDE favorito que admita el desarrollo de aplicaciones Spring Boot.

Librerias 

    Lombok se utiliza en este proyecto para generar automáticamente métodos getter, setter, constructores y otros
    métodos comunes en las clases de entidad y DTO (Objectos de Transferencia de Datos).
    
    MapStruct se utiliza en este proyecto para mapear los objetos de dominio a objetos DTO y viceversa, 
    lo que facilita la transferencia de datos entre las diferentes capas de la aplicación de manera eficiente y sin la necesidad de escribir código boilerplate.

La aplicación se ejecutará en http://localhost:8080.

    Hasta el momento cuenta con 2 endpoint
    http://localhost:8080/api/property/one/{id} : metodo get que permite obtener una propiedidad mediante la id 
    http://localhost:8080/api/property/all : metodo get que permite obtener todas las propiedad 

    Se recomienda usar sofware Postman para probar cada endpoint


La base de datos H2 está incrustada en la aplicación y se inicializa utilizando un script SQL al arrancar la aplicación. Puedes acceder a la consola de administración de H2 mediante la siguiente URL:

http://localhost:8080/h2-console

    JDBC URL: jdbc:h2:mem:testdb
    Usuario: sa
    Contraseña: (dejar en blanco)

Asegúrate de que la aplicación esté en ejecución antes de intentar acceder a la consola de H2.
Estructura del Proyecto

El proyecto sigue una estructura de paquetes basada en la arquitectura hexagonal:

    com.alltickekts.application: Capa de aplicación que contiene los casos de uso de la aplicación.
    com.alltickets..domain: Capa de dominio que contiene las entidades y reglas de negocio.
    com.alltickets.infrastructure: Capa de infraestructura que incluye la implementación de los 
    repositorios, adaptadores, controllers, DTOs y Mappers ademas de implementación específica.
    resources/data.sql: se encuentran los datos injectados en la base de datos mediante script SQL
