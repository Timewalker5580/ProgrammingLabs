public class Main {
  public static void main(String[] args) {
    Bike firstBike = new Bike();
    Bike secondBike = new Bike(21, 23.4, 130, "Pinarello", 23000, "Andrew");
    Bike thirdBike = new Bike(23, 30.4, 110, "Electra");

    System.out.println(firstBike.toString());
    System.out.println(secondBike.toString());
    System.out.println(thirdBike.toString());
  }
}

public record Bike(int qtyGear, double weight, int maxWeight, String brand, int price ,String owner) {

  private static final boolean isTwoWheels = true;

  public Bike() {
    this(27, 14.08 , 120, "Trek", 27000, "Dmytro");
  }

  public Bike(int qtyGear, double weight, int maxWeight, String brand) {
    this(qtyGear, weight, maxWeight, brand, 10000, "Steve");
  }

  @Override
  public String toString() {
    return " quantity of gears: " + qtyGear + "\n masa: " + weight + " kg" + "\n maxWeight: " + maxWeight + " kg" +
           "\n brand: " + brand + "\n price: " + price + " uah" + "\n owner: " + owner + "\n bike has two wheels: " + isTwoWheels() + "\n";
  }

  public static boolean isTwoWheels() {
    return isTwoWheels;
  }
}
