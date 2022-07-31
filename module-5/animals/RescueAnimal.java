package animals;

import java.lang.String;

import enums.*;
import java.util.Scanner;

public class RescueAnimal {

	// Instance variables
	private String name;
	private AnimalType animalType;
	private Gender gender;
	private String age;
	private String weight;
	private String acquisitionDate;
	private String acquisitionCountry;
	private TrainingStatus trainingStatus;
	private boolean reserved;
	private String inServiceCountry;

	// Constructor
	public RescueAnimal() {
	}

	public void intakeAnimal(Scanner scanner, AnimalType animal) {
		switch (animal) {
			case Dog:
				this.animalType = AnimalType.Dog;
				break;
			case Monkey:
				this.animalType = AnimalType.Monkey;
				break;

			default:
				break;
		}

		System.out.println("Input Animal Gender");
		System.out.println("[1] Male");
		System.out.println("[2] Female");
		int userInput = scanner.nextInt();

		switch (userInput) {
			case 1:
				this.gender = Gender.Male;
			case 2:
				this.gender = Gender.Female;
		}

		System.out.println("Input Animal Age");
		userInput = scanner.nextInt();
		this.age = String.valueOf(userInput);

		System.out.println("Input Animal Weight");
		userInput = scanner.nextInt();
		this.weight = String.valueOf(userInput);

		System.out.println("Input Animal Acquisition Date");
		String date = scanner.next();
		this.weight = date;

		System.out.println("Input Animal Gender");
		System.out.println("[1] Male");
		System.out.println("[2] Female");
		userInput = scanner.nextInt();

		this.trainingStatus = TrainingStatus.Intake;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AnimalType getAnimalType() {
		return animalType;
	}

	public void setAnimalType(AnimalType animalType) {
		this.animalType = animalType;
	}

	public Gender getGender() {
		return this.gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public String getAcquisitionLocation() {
		return acquisitionCountry;
	}

	public void setAcquisitionLocation(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}

	public boolean getReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	public String getInServiceLocation() {
		return inServiceCountry;
	}

	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}

	public TrainingStatus getTrainingStatus() {
		return this.trainingStatus;
	}

	public void setTrainingStatus(TrainingStatus trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
}
