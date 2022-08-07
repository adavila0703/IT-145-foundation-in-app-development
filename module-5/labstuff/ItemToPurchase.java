package labstuff;

import java.util.Scanner;

public class ItemToPurchase {
  private String itemName;
  private int itemPrice;
  private int itemQuantity;

  public ItemToPurchase() {
    this.itemName = "None";
    this.itemPrice = 0;
    this.itemQuantity = 0;
  }

  public void setItemInformation() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the item name: ");
    try {
      this.setName(scnr.nextLine());
    } catch (java.util.NoSuchElementException e) {
    }
    System.out.println("Enter the item price: ");
    try {
      this.setPrice(scnr.nextInt());
    } catch (java.util.NoSuchElementException e) {
    }
    System.out.println("Enter the item quantity: ");
    try {
      this.setQuantity(scnr.nextInt());
    } catch (java.util.NoSuchElementException e) {
    }
    System.out.println("");
  }

  public void setName(String name) {
    this.itemName = name;
  }

  public void setPrice(int price) {
    this.itemPrice = price;
  }

  public void setQuantity(int quantity) {
    this.itemQuantity = quantity;
  }

  public String getName() {
    return this.itemName;
  }

  public int getPrice() {
    return this.itemPrice;
  }

  public int getQuantity() {
    return this.itemQuantity;
  }

  public int getTotal() {
    return this.itemPrice * this.itemQuantity;
  }

  public void printItemPurchase() {
    System.out.printf("%s %s @ $%s = $%s\n", this.itemName, this.itemQuantity, this.itemPrice,
        (this.itemPrice * this.itemQuantity));
  }
}
