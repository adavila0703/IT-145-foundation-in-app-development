package petlabs;

public class Dog extends Pet {
   private String breed;

   public Dog() {

   }

   public Dog(String name, int age, String breed) {
      setName(name);
      setAge(age);
      this.breed = breed;

   }

   public void setBreed(String userBreed) {
      this.breed = userBreed;
   }

   public String getBreed() {
      return breed;
   }
}