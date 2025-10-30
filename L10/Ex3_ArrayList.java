import java.util.ArrayList; // import the ArrayList class
public class Ex3_ArrayList {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    for (int i = 0; i < cars.size(); i++) {
      System.out.print(cars.get(i)+" ");
    }
    //System.exit(1);
    /*
    str.length()
    arr.length
    ArrayList.size()
    */
    System.out.println();
    //System.exit(1);
    for (String i : cars) { // for each loop
      System.out.print(i+" ");
    }
    System.out.println();
    //System.exit(1);
    for (String i : cars) { // for each loop
      i = "Honda";
    }
    System.out.println(cars);
    //System.exit(1);
    for (int i = 0; i < cars.size(); i++) {
      cars.set(i,"Toyota");
    }
    System.out.println(cars);
  }
}
