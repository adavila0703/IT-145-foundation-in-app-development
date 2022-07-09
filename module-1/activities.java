
import java.util.Scanner;

public class activities {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double sphereVolume;
      double sphereRadius;

      sphereRadius = scnr.nextDouble();

      sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3);

      System.out.printf("%.2f\n", sphereVolume);
   }
}