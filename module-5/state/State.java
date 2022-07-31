package state;

import java.util.ArrayList;

import animals.*;
import enums.AnimalType;

public class State {
  private ArrayList<Dog> dogs = new ArrayList<Dog>();
  private ArrayList<Monkey> monkeys = new ArrayList<Monkey>();
  private boolean appStatus;

  public State(boolean appStatus) {
    this.appStatus = appStatus;
  }

  public void addAnimal(Dog dog) {
    this.dogs.add(dog);
  }

  public void addAnimal(Monkey monkey) {
    this.monkeys.add(monkey);
  }

  public boolean getAppStatus() {
    return this.appStatus;
  }

  public void setAppStatus(boolean appStatus) {
    this.appStatus = appStatus;
  }

  // returns if a dog name already exists
  public boolean animalNameAvailability(String name, AnimalType animalType) {
    switch (animalType) {
      case Dog:
        for (Dog dog : this.dogs) {
          if (dog.getName().equalsIgnoreCase(name)) {
            return false;
          }
        }
        break;
      case Monkey:
        for (Monkey monkey : this.monkeys) {
          if (monkey.getName().equalsIgnoreCase(name)) {
            return false;
          }
        }
        break;

      default:
        break;
    }

    return true;
  }

  public void printAllAnimals(AnimalType animalType) {
    switch (animalType) {
      case Dog:
        System.out.println("List of Dogs:");

        for (int i = 0; i < this.dogs.size(); i++) {
          System.out.printf("%d. %s \n", i + 1, this.dogs.get(i).getName());
        }

        break;
      case Monkey:
        System.out.println("List of Monkeys:");

        for (int i = 0; i < this.monkeys.size(); i++) {
          System.out.printf("%d. %s \n", i + 1, this.monkeys.get(i).getName());
        }

        break;

      default:
        break;
    }
  }

  public void printAnimalsNotReserved() {
    int count = 1;
    for (Dog dog : this.dogs) {
      if (!dog.getReserved()) {
        System.out.printf("%d. %s\n", count, dog.getName());
        count++;
      }
    }
    for (Monkey monkey : this.monkeys) {
      if (!monkey.getReserved()) {
        System.out.printf("%d. %s\n", count, monkey.getName());
        count++;
      }
    }
  }
}
