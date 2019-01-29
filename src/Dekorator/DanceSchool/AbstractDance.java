package Dekorator.DanceSchool;

public abstract class AbstractDance {
  String description;
  float price;

  float getPrice() {
    return price;
  }

  String getDescription() {
    return description;
  }

  void getInfo() {
    System.out.println("Description: " + getDescription() + ", Price: " + getPrice());
  }
}
