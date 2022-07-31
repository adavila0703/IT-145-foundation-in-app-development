package animals;

import enums.*;
import java.util.Scanner;

public class Monkey extends RescueAnimal {
  // Instance variable
  private MonkeyBreed mokeyBreed;

  // empty constructor
  public Monkey() {
  }

  // constructor with name
  public Monkey(String name) {
    setName(name);
  }

  // main constructor
  public Monkey(
      String name,
      MonkeyBreed breed,
      Gender gender,
      String age,
      String weight,
      String acquisitionDate,
      String acquisitionCountry,
      TrainingStatus trainingStatus,
      boolean reserved,
      String inServiceCountry) {
    setName(name);
    setBreed(breed);
    setGender(gender);
    setAge(age);
    setWeight(weight);
    setAcquisitionDate(acquisitionDate);
    setAcquisitionLocation(acquisitionCountry);
    setTrainingStatus(trainingStatus);
    setReserved(reserved);
    setInServiceCountry(inServiceCountry);
    setAnimalType(AnimalType.Monkey);
  }

  // logic to intake animal data
  public void intakeMonkey(Scanner scanner) {
    intakeAnimal(scanner, AnimalType.Monkey);

    System.out.println("Input Monkey Breed");
    System.out.println("[1] Capuchin");
    System.out.println("[2] Guenon");
    System.out.println("[3] Macaque");
    System.out.println("[4] Marmoset");

    int userInput = scanner.nextInt();

    switch (userInput) {
      case 1:
        this.mokeyBreed = MonkeyBreed.Capuchin;
        break;
      case 2:
        this.mokeyBreed = MonkeyBreed.Guenon;
        break;
      case 3:
        this.mokeyBreed = MonkeyBreed.Macaque;
        break;
      case 4:
        this.mokeyBreed = MonkeyBreed.Marmoset;
        break;

      default:
        break;
    }

  }

  // display breed
  public void displayMonkeyBreed() {
    switch (this.mokeyBreed) {
      case Capuchin:
        System.out.print("Capuchin");
        break;
      case Guenon:
        System.out.print("Guenon");
        break;
      case Macaque:
        System.out.print("Macaque");
        break;
      case Marmoset:
        System.out.print("Marmoset");
        break;

      default:
        break;
    }
  }

  // get breed
  public MonkeyBreed getBreed() {
    return this.mokeyBreed;
  }

  // set breed
  public void setBreed(MonkeyBreed mokeyBreed) {
    this.mokeyBreed = mokeyBreed;
  }
}
