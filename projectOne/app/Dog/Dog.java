package Dog;

import Pet.Pet;

public class Dog extends Pet {
  private int dogSpaceNumber;
  private int dogWeight;
  private boolean grooming;

  // constructor all values set to default
  public Dog() {
    this.dogSpaceNumber = 0;
    this.dogWeight = 0;
    this.grooming = false;
  }

  // constructor all values set
  public Dog(int dogSpaceNumber, int dogWeight, boolean grooming) {
    this.dogSpaceNumber = dogSpaceNumber;
    this.dogWeight = dogWeight;
    this.grooming = grooming;
  }

  // return dog space number
  public int getDogSpaceNumber() {
    return this.dogSpaceNumber;
  }

  // set dog space number
  public void setDogSpaceNumber(int dogSpaceNumber) {
    this.dogSpaceNumber = dogSpaceNumber;
  }

  // get dog weight
  public int getDogWeight() {
    return this.dogWeight;
  }

  // set dog weight
  public void setDogWeight(int dogWeight) {
    this.dogWeight = dogWeight;
  }

  // get grooming
  public boolean getGrooming() {
    return this.grooming;
  }

  // set grooming
  public void setGrooming(boolean grooming) {
    this.grooming = grooming;
  }
}
