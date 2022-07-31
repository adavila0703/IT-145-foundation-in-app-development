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

		while (StateSingleton.state.getAppStatus()) {
			displayMenu();

			int userInput = scnr.nextInt();
			menuOptions(userInput, scnr);

			System.out.flush();
		}
		System.out.println("Closing application, good bye!");

	}

	public static void menuOptions(int userInput, Scanner scanner) {
		switch (userInput) {
			case 1:
				intakeNewDog(scanner);
				break;
			case 2:
				intakeNewMonkey(scanner);
				break;
			case 3:
				reserveAnimal(scanner);
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

	// This method prints the menu options
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

	// Adds dogs to a list for testing
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
				false, "United States");
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

	// Adds monkeys to a list for testing
	// Optional for testing
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

	// Complete the intakeNewDog method
	// The input validation to check that the dog is not already in the list
	// is done for you
	public static void intakeNewDog(Scanner scanner) {
		System.out.println("What is the dog's name?");
		while (true) {
			String name = scanner.next();

			if (!StateSingleton.state.animalNameAvailability(name, AnimalType.Dog)) {
				System.out.println("Sorry the dog's name has been taken, try again");
				continue;
			}

			break;
		}

		Dog dog = new Dog();

		dog.intakeDog(scanner);

		StateSingleton.state.addAnimal(dog);

		System.out.printf("%s is now in the system.\n", dog.getName());
	}

	// // Add the code to instantiate a new dog and add it to the appropriate list
	// }

	// Complete intakeNewMonkey
	// Instantiate and add the new monkey to the appropriate list
	// For the project submission you must also validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
	public static void intakeNewMonkey(Scanner scanner) {
		System.out.println("What is the monkey's name?");
		while (true) {
			String name = scanner.next();

			if (!StateSingleton.state.animalNameAvailability(name, AnimalType.Monkey)) {
				System.out.println("Sorry the monkey's name has been taken, try again");
				continue;
			}

			break;
		}

		Monkey monkey = new Monkey();

		monkey.intakeMonkey(scanner);

		StateSingleton.state.addAnimal(monkey);

		System.out.printf("%s is now in the system.\n", monkey.getName());
	}

	// Complete reserveAnimal
	// You will need to find the animal by animal type and in service country
	public static void reserveAnimal(Scanner scanner) {
		System.out.println("The method reserveAnimal needs to be implemented");

	}

	// Complete printAnimals
	// Include the animal name, status, acquisition country and if the animal is
	// reserved.
	// Remember that this method connects to three different menu items.
	// The printAnimals() method has three different outputs
	// based on the listType parameter
	// dog - prints the list of dogs
	// monkey - prints the list of monkeys
	// available - prints a combined list of all animals that are
	// fully trained ("in service") but not reserved
	// Remember that you only have to fully implement ONE of these lists.
	// The other lists can have a print statement saying "This option needs to be
	// implemented".
	// To score "exemplary" you must correctly implement the "available" list.
	public static void printAnimals() {
		System.out.println("The method printAnimals needs to be implemented");
	}

	public static void appError(String err) {
		System.out.printf("Error: %s", err);
	}
}
