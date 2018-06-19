# Reservations
## Projeto desenvolvido durante o curso do E-Learning Linkedin: Learning Spring with Spring Boot
### Segue abaixo a estrutura do projeto

```
-- Reservations
    |-- .gitignore
    |-- README.md
    |-- mvnw
    |-- mvnw.cmd
    |-- pom.xml
    |-- .idea
    |   |-- compiler.xml
    |   |-- encodings.xml
    |   |-- misc.xml
    |   |-- uiDesigner.xml
    |   |-- vcs.xml
    |   |-- workspace.xml
    |   |-- httpRequests
    |       |-- 2018-06-18T075020.200.json
    |       |-- 2018-06-18T075138.200.json
    |       |-- 2018-06-19T105314.200.json
    |       |-- http-requests-log.http
    |-- .mvn
    |   |-- wrapper
    |       |-- maven-wrapper.jar
    |       |-- maven-wrapper.properties
    |-- src
    |   |-- main
    |   |   |-- java
    |   |   |   |-- dewtech
    |   |   |       |-- reservations
    |   |   |           |-- ReservationsApplication.java
    |   |   |           |-- landon
    |   |   |               |-- business
    |   |   |               |   |-- domain
    |   |   |               |   |   |-- RoomReservation.java
    |   |   |               |   |-- service
    |   |   |               |       |-- ReservationService.java
    |   |   |               |-- data
    |   |   |               |   |-- entity
    |   |   |               |   |   |-- Guest.java
    |   |   |               |   |   |-- Reservation.java
    |   |   |               |   |   |-- Room.java
    |   |   |               |   |-- repository
    |   |   |               |   |   |-- GuestRepository.java
    |   |   |               |   |   |-- ReservationRepository.java
    |   |   |               |   |   |-- RoomRepository.java
    |   |   |               |   |-- webservice
    |   |   |               |       |-- RoomController.java
    |   |   |               |-- web
    |   |   |                   |-- application
    |   |   |                   |   |-- ReservationController.java
    |   |   |                   |-- service
    |   |   |                       |-- ReservationServiceController.java
    |   |   |-- resources
    |   |       |-- application.properties
    |   |       |-- data.sql
    |   |       |-- schema.sql
    |   |       |-- static
    |   |       |   |-- index.html
    |   |       |   |-- css
    |   |       |   |   |-- site.css
    |   |       |   |-- js
    |   |       |       |-- site.js
    |   |       |-- templates
    |   |           |-- reservations.html
    |   |-- test
    |       |-- java
    |           |-- dewtech
    |               |-- reservations
    |                   |-- ReservationsApplicationTests.java
    |                   |-- landon
    |                       |-- web
    |                           |-- application
    |                               |-- ReservationControllerTest.java
    |-- target
        |-- classes
        |   |-- application.properties
        |   |-- data.sql
        |   |-- schema.sql
        |   |-- dewtech
        |   |   |-- reservations
        |   |       |-- ReservationsApplication.class
        |   |       |-- landon
        |   |           |-- business
        |   |           |   |-- domain
        |   |           |   |   |-- RoomReservation.class
        |   |           |   |-- service
        |   |           |       |-- ReservationService.class
        |   |           |-- data
        |   |           |   |-- entity
        |   |           |   |   |-- Guest.class
        |   |           |   |   |-- Reservation.class
        |   |           |   |   |-- Room.class
        |   |           |   |-- repository
        |   |           |   |   |-- GuestRepository.class
        |   |           |   |   |-- ReservationRepository.class
        |   |           |   |   |-- RoomRepository.class
        |   |           |   |-- webservice
        |   |           |       |-- RoomController.class
        |   |           |-- web
        |   |               |-- application
        |   |                   |-- ReservationController.class
        |   |-- static
        |   |   |-- index.html
        |   |   |-- css
        |   |   |   |-- site.css
        |   |   |-- js
        |   |       |-- site.js
        |   |-- templates
        |       |-- reservations.html
        |-- generated-sources
        |   |-- annotations
        |-- generated-test-sources
        |   |-- test-annotations
        |-- test-classes
            |-- dewtech
                |-- reservations
                    |-- ReservationsApplicationTests.class
                    |-- landon
                        |-- web
                            |-- application
                                |-- ReservationControllerTest.class
```