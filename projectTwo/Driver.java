import java.util.Scanner;

import animals.*;
import enums.*;
import state.*;

public class Driver {
	public static void main(String[] args) {
		// initialize state
		StateSingleton.newStateSingleton();
		Scanner scnr = new Scanner(System.in);

		// initialize mock data
		initializeDogList();
		initializeMonkeyList();

		// start menu
		while (StateSingleton.state.getAppStatus()) {
			displayMenu();

			int userInput = scnr.nextInt();
			menu(userInput, scnr);

			System.out.flush();
		}
		System.out.println("Closing application, good bye!");

	}

	// handles the menu for our application
	public static void menu(int userInput, Scanner scanner) {
		switch (userInput) {
			case 1:
				StateSingleton.state.intakeAnimal(scanner, AnimalType.Dog);
				break;
			case 2:
				StateSingleton.state.intakeAnimal(scanner, AnimalType.Monkey);
				break;
			case 3:
				StateSingleton.state.reserveAnimal(scanner);
				break;
			case 4:
				StateSingleton.state.printAllAnimals(AnimalType.Dog);
				break;
			case 5:
				StateSingleton.state.printAllAnimals(AnimalType.Monkey);
				break;
			case 6:
				StateSingleton.state.printAnimalsNotReserved();
				break;
			case 0:
				StateSingleton.state.setAppStatus(false);
				break;
			default:
				break;
		}
	}

	// displays main menu
	public static void displayMenu() {
		System.out.println("\n\n");
		System.out.println("\t\t\t\tRescue Animal System Menu");
		System.out.println("[1] Intake a new dog");
		System.out.println("[2] Intake a new monkey");
		System.out.println("[3] Reserve an animal");
		System.out.println("[4] Print a list of all dogs");
		System.out.println("[5] Print a list of all monkeys");
		System.out.println("[6] Print a list of all animals that are not reserved");
		System.out.println("[0] Quit application");
		System.out.println();
		System.out.println("Enter a menu selection");
	}

	// mock dogs
	public static void initializeDogList() {
		Dog dog1 = new Dog(
				"Spot",
				DogBreed.GermanShepherd,
				Gender.Male,
				"1",
				"25.6",
				"05-12-2019",
				"United States",
				TrainingStatus.Intake,
				false,
				"United States");
		Dog dog2 = new Dog(
				"Rex",
				DogBreed.GreatDane,
				Gender.Male,
				"3",
				"35.2",
				"02-03-2020",
				"United States",
				TrainingStatus.Phase1,
				false,
				"United States");
		Dog dog3 = new Dog(
				"Bella",
				DogBreed.Chihuahua,
				Gender.Female,
				"4",
				"25.6",
				"12-12-2019",
				"Canada",
				TrainingStatus.InService,
				true,
				"Canada");
		StateSingleton.state.addAnimal(dog1);
		StateSingleton.state.addAnimal(dog2);
		StateSingleton.state.addAnimal(dog3);
	}

	// mock monkeys
	public static void initializeMonkeyList() {
		Monkey monkey1 = new Monkey(
				"Jerry",
				MonkeyBreed.Capuchin,
				Gender.Male,
				"4",
				"30",
				"12-12-2019",
				"Canada",
				TrainingStatus.Intake,
				true,
				"Canada");
		Monkey monkey2 = new Monkey(
				"George",
				MonkeyBreed.Macaque,
				Gender.Female,
				"10",
				"50",
				"12-12-2019",
				"Canada",
				TrainingStatus.Intake,
				true,
				"Canada");

		StateSingleton.state.addAnimal(monkey1);
		StateSingleton.state.addAnimal(monkey2);

	}
}
