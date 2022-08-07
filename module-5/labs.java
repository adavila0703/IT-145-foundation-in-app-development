import labstuff.*;
import petlabs.*;
import java.util.Scanner;

import java.util.ArrayList;

public class labs {
  public static void onlineShoppingCart() {
    ItemToPurchase item1 = new ItemToPurchase();
    ItemToPurchase item2 = new ItemToPurchase();

    // Get item 1 details from user, create itemToPurchase object
    System.out.println("Item 1");
    item1.setItemInformation();

    // Get item 2 details from user, create itemToPurchase object
    System.out.println("Item 2");
    item2.setItemInformation();

    System.out.println("TOTAL COST");
    item1.printItemPurchase();
    item2.printItemPurchase();

    System.out.printf("\nTotal: %s", item1.getTotal() + item2.getTotal());
  }

  public static void petInformation() {
    Scanner scnr = new Scanner(System.in);

    scnr.nextBoolean()

    Pet myPet = new Pet();
    Dog myDog = new Dog();

    String petName, dogName, dogBreed;
    int petAge, dogAge;

    petName = scnr.nextLine();
    petAge = scnr.nextInt();
    scnr.nextLine();
    dogName = scnr.next();
    dogAge = scnr.nextInt();
    scnr.nextLine();
    dogBreed = scnr.nextLine();

    // TODO: Create generic pet (using petName, petAge) and then call printInfo
    myPet.setName(petName);
    myPet.setAge(petAge);

    // TODO: Create dog pet (using dogName, dogAge, dogBreed) and then call
    // printInfo
    myDog.setName(dogName);
    myDog.setAge(dogAge);
    myDog.setBreed(dogBreed);
    // TODO: Use getBreed(), to output the breed of the dog
    myPet.printInfo();
    myDog.printInfo();
    System.out.printf("   Breed: %s", myDog.getBreed());
  }

  public static void main(String[] args) {
    // onlineShoppingCart();
    // petInformation();

    ArrayList<String> test = new ArrayList<String>();
    for (String string : test) {
      test.add(e)
    }
  }
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

  // TODO: Define a printArrayList method that prints an ArrayList of plant (or
  // flower) objects

  public static void printArrayList(ArrayList<Plant> myGarden) {
    for (Plant plant : myGarden) {
      plant.printInfo();
    }
  }

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String input;
    // TODO: Declare an ArrayList called myGarden that can hold object of type plant
    ArrayList<Plant> myGarden = new ArrayList<Plant>();

    // TODO: Declare variables - plantName, plantCost, colorOfFlowers, isAnnual
    String colorOfFlowers, plantName, plantCost;
    boolean isAnnual;

    input = scnr.next();
    while (!input.equals("-1")) {
      // TODO: Check if input is a plant or flower
      // Store as a plant object or flower object
      // Add to the ArrayList myGarden
      switch (input) {
        case "plant":
          Plant plant = new Plant();
          input = scnr.next();
          plant.setPlantName(input);
          input = scnr.next();
          plant.setPlantCost(input);
          myGarden.add(plant);
          break;
        case "flower":
          Flower flower = new Flower();
          input = scnr.next();
          flower.setPlantName(input);
          input = scnr.next();
          flower.setPlantCost(input);
          boolean boolInput = scnr.nextBoolean();
          flower.setPlantType(boolInput);
          input = scnr.next();
          flower.setColorOfFlowers(input);
          myGarden.add(flower);
          break;
      }
    }

    // TODO: Call the method printArrayList to print myGarden
    printArrayList(myGarden);
  }
}
