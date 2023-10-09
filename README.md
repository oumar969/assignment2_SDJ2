# assignmentSDJ2

PART2: 
Implement a registration system for the animals as a RESTful web service. The service should store date, weight, registration number and origin (i.e. farm) of the animal. It should be possible to read the details of a specific animal, all animals arriving at a particular date, and all animals of a particular origin.
The service doesn’t need a graphical user interface, but it must be tested


AnimalController:
AnimalController er en Spring Boot-controller til at administrere operationer relateret til dyr via en RESTful API.
Den udfører handlinger som at tilføje, hente, slette og liste dyr ved hjælp af forskellige HTTP-metoder og anvender AnimalRepository til databehandling.

Animal:
Animal-klassen repræsenterer dyr med attributter som id, dateDelivered, og origin. 
Den er markeret som en JPA-entitet og kan gemmes i en database. Den har getters og setters til at få adgang til og ændre attributværdier.


AnimalRepository:
AnimalRepository er en simpel in-memory datalagerklasse, der opbevarer Animal-objekter og giver grundlæggende CRUD-operationer (Create, Read, Update, Delete) for disse objekter.
Den bruges til midlertidig opbevaring af data i din applikation.

