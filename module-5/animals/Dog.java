package animals;

import enums.*;
import java.util.Scanner;

public class Dog extends RescueAnimal {

	// Instance variable
	private DogBreed dogBreed;

	public Dog() {
	}

	// Constructor
	public Dog(
			String name,
			DogBreed breed,
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
	}

	public void intakeDog(Scanner scanner) {
		intakeAnimal(scanner, AnimalType.Dog);

		System.out.println("Input Dog Breed");
		System.out.println("[1] German Shepherd");
		System.out.println("[2] Great Dane");
		System.out.println("[3] Chihuahua");

		int userInput = scanner.nextInt();

		switch (userInput) {
			case 1:
				this.dogBreed = DogBreed.GermanShepherd;
				break;
			case 2:
				this.dogBreed = DogBreed.GreatDane;
				break;
			case 3:
				this.dogBreed = DogBreed.Chihuahua;
				break;

			default:
				break;
		}

	}

	public void displayDogBreed() {
		switch (this.dogBreed) {
			case GermanShepherd:
				System.out.print("German Shepherd");
				break;
			case GreatDane:
				System.out.print("Great Dane");
				break;
			case Chihuahua:
				System.out.print("Chihuahua");
				break;

			default:
				break;
		}
	}

	// Accessor Method
	public DogBreed getBreed() {
		return this.dogBreed;
	}

	// Mutator Method
	public void setBreed(DogBreed dogBreed) {
		this.dogBreed = dogBreed;
	}

}
