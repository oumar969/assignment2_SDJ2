// AnimalRepository.java
package com.example.assignment.Repository;

import com.example.assignment.Model.Animal;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalRepository {

    private final List<Animal> animals = new ArrayList<>();
    public AnimalRepository() {
        // Adding some dummy data for testing
        animals.add(new Animal(1, LocalDate.parse("2023-10-01"), "Farm A"));
        animals.add(new Animal(2, LocalDate.parse("2023-10-02"), "Farm B"));
        animals.add(new Animal(3, LocalDate.parse("2023-10-03"), "Farm A"));
        animals.add(new Animal(4, LocalDate.parse("2023-10-04"), "Farm C"));
        animals.add(new Animal(5, LocalDate.parse("2023-10-05"), "Farm B"));
        animals.add(new Animal(6, LocalDate.parse("2023-10-06"), "Farm A"));
    }
    public List<Animal> getAllAnimals() {
        return animals;
    }
    public void addAnimal(Animal animal) {
        System.out.println("Before adding animal: " + animals);
        animals.add(animal);
        System.out.println("After adding animal: " + animals);
    }

    public Animal getAnimalById(int id) {
        return animals.stream()
                .filter(animal -> animal.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Animal> getAnimalsByArrivalDate(String date) {
        // Implement logic to filter animals by arrival date (dummy data)
        LocalDate localDate = LocalDate.parse(date); // Convert date string to LocalDate
        List<Animal> filteredAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getDateDelivered().equals(localDate)) {
                filteredAnimals.add(animal);
            }
        }
        return filteredAnimals;
    }

    public List<Animal> getAnimalsByOrigin(String origin) {
        // Implement logic to filter animals by origin (dummy data)
        List<Animal> filteredAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getOrigin().equals(origin)) {
                filteredAnimals.add(animal);
            }
        }
        return filteredAnimals;
    }

    public boolean removeAnimalById(int id) {
        Animal animalToRemove = animals.stream()
                .filter(animal -> animal.getId() == id)
                .findFirst()
                .orElse(null);
        if (animalToRemove != null) {
            animals.remove(animalToRemove);
            return true;
        }
        return false;
    }
}
