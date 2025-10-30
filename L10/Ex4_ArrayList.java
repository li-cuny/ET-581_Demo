import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Ex4_ArrayList {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    Collections.sort(cars);  // Sort cars
    System.out.println(cars);
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);
    System.out.println(myNumbers);
    Collections.sort(myNumbers);  // Sort myNumbers
    System.out.println(myNumbers);
  }
}
