import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

import plants.*;

public class PlantArrayListExample {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or
   // flower) objects

   public static void printArrayList(ArrayList<Plant> myGarden) {
      for (Plant plant : myGarden) {
         plant.printInfo();
         System.out.println("");
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
         switch (input.toLowerCase()) {
            case "plant":
               System.out.println("plant");
               Plant plant = new Plant();
               input = scnr.next();
               plant.setPlantName(input);
               input = scnr.next();
               plant.setPlantCost(input);
               myGarden.add(plant);
               System.out.println("plant added");
               break;
            case "flower":
               System.out.println("flower");
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
               System.out.println("flower added");
               break;
            default:
               break;
         }
         input = scnr.next();
      }

      // TODO: Call the method printArrayList to print myGarden
      printArrayList(myGarden);
   }
}
