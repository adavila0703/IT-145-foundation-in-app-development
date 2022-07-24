package Pet;

import javax.xml.catalog.Catalog;

public class Pet {
  private String PetName;
  private Integer PetAge;
  private PetType PetType;
  private Integer PetSpaces;
  private Integer DaysStaying;
  private Integer Amount;

  // set initial values
  public Pet(String petName, Integer petAge, PetType petType) {
    this.PetName = petName;
    this.PetAge = petAge;
    this.PetType = petType;

    switch (petType) {
      case Dog:
        this.PetSpaces = 30;
        break;
      case Cat:
        this.PetSpaces = 12;
        break;
      default:
        break;
    }
  }

  // set pet type
  public void setPetType(PetType petType) {
    this.PetType = petType;
  }

  // get pet type
  public PetType getPetType() {
    return this.PetType;
  }

  // set pet name
  public void setPetName(String petName) {
    this.PetName = petName;
  }

  // get pet name
  public String getPetName() {
    return this.PetName;
  }

  // set pet age
  public void setPetAge(Integer petAge) {
    this.PetAge = petAge;
  }

  // get pet age
  public Integer getPetAge() {
    return this.PetAge;
  }

  // set pet spaces
  public void setPetSpaces(Integer petSpaces) {
    this.PetSpaces = petSpaces;
  }

  // get pet spaces
  public Integer getPetSpaces() {
    return this.PetSpaces;
  }

  // set days staying
  public void setDaysStay(Integer daysStaying) {
    this.DaysStaying = daysStaying;
  }

  // get days staying
  public Integer getDaysStay() {
    return this.DaysStaying;
  }

  // get amount due
  public Integer getAmountDue() {
    return this.Amount;
  }

  // set amount due
  public void setAmountDue(Integer amount) {
    this.Amount = amount;
  }

}
