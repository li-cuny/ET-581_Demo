import java.util.LinkedList;

public class Ex8_LinkedList {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    Iterator<String> itr=cars.iterator();
    while(cars.hasNext()){
        System.out.println(cars.next());
    }
  }
}
