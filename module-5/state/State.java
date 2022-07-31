package state;

import java.util.ArrayList;

import animals.*;
import enums.AnimalType;
import java.util.Scanner;

// state will store our application state
public class State {
  // stores all our animal objects
  private ArrayList<RescueAnimal> animals = new ArrayList<RescueAnimal>();
  // stores our application status
  // true is on and false is off
  private boolean appStatus;

  // constructor
  public State(boolean appStatus) {
    this.appStatus = appStatus;
  }

  // add animal
  public void addAnimal(RescueAnimal animal) {
    this.animals.add(animal);
  }

  // get app status
  public boolean getAppStatus() {
    return this.appStatus;
  }

  // set app status
  public void setAppStatus(boolean appStatus) {
    this.appStatus = appStatus;
  }

  // returns if a dog name already exists
  public boolean animalNameAvailability(String name, AnimalType animalType) {
    for (RescueAnimal animal : this.animals) {
      if (animal.getName().equalsIgnoreCase(name) && animal.getAnimalType() == animalType) {
        return false;
      }
    }
    return true;
  }

  // prints all animals
  public void printAllAnimals(AnimalType animalType) {
    String animalName = animalType == AnimalType.Dog ? "dogs" : "monkeys";
    System.out.printf("List of %s:\n", animalName);
    int count = 1;

    for (RescueAnimal animal : animals) {
      if (animal.getAnimalType() == animalType) {
        System.out.printf("%d. %s \n", count, animal.getName());
        count++;
      }
    }
  }

  // prints all animals which are not reserved
  public void printAnimalsNotReserved() {
    int count = 1;

    for (RescueAnimal animal : this.animals) {
      if (!animal.getReserved()) {
        System.out.printf("%d. %s\n", count, animal.getName());
        count++;
      }
    }
  }

  // starts the intake animal process
  // this will call intake on both RescueAnimal and its children
  public void intakeAnimal(Scanner scanner, AnimalType animalType) {
    String name;
    String animalName = animalType == AnimalType.Dog ? "dog" : "monkey";

    System.out.printf("What is the %s's name?\n", animalName);
    while (true) {
      name = scanner.next();

      if (!this.animalNameAvailability(name, animalType)) {
        System.out.printf("Sorry the %s's name has been taken, try again\n", animalName);
        continue;
      }

      break;
    }

    switch (animalType) {
      case Dog:
        Dog dog = new Dog(name);
        dog.intakeDog(scanner);

        StateSingleton.state.addAnimal(dog);
        System.out.printf("%s is now in the system.\n", dog.getName());
        break;
      case Monkey:
        Monkey monkey = new Monkey(name);
        monkey.intakeMonkey(scanner);

        StateSingleton.state.addAnimal(monkey);
        System.out.printf("%s is now in the system.\n", monkey.getName());
        break;

      default:
        break;
    }

  }

  // get all animals and their reserve status
  private void getListAnimalsByReserved() {
    int count = 1;

    for (RescueAnimal animal : this.animals) {
      String animalName = animal.getAnimalType() == AnimalType.Dog ? "dog" : "monkey";
      System.out.printf("%d. %s | %s | %s\n", count, animal.getName(), animalName, animal.getReserved());
      count++;
    }
  }

  // open reserve animal menu
  public void reserveAnimal(Scanner scanner) {
    while (true) {
      System.out.println("\n\nSwitch animals reserved status\n");
      System.out.println("# | Name | Type | Reserved");
      getListAnimalsByReserved();
      System.out.println("[0] To exit reserved menu");

      int userInput = scanner.nextInt();
      if (userInput == 0) {
        break;
      }
      int animalIndex = userInput - 1;
      this.animals.get(animalIndex).setReserved(!this.animals.get(animalIndex).getReserved());

    }
  }
}
