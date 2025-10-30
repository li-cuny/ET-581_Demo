import java.util.ArrayList; // import the ArrayList class
public class Ex2_ArrayList {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    System.out.println(cars.get(0));
    // set(index, the value to assign);
    cars.set(1, "Opel");
    System.out.println(cars);
    //System.exit(1);

    ArrayList<String> al2=new ArrayList<String>();
    al2.add("Honda");
    al2.add("Toyota");
    //Adding second list elements to the first list
    // ArrayList1.addAll(ArrayList2);
    cars.addAll(al2);
    System.out.println(cars);
    //System.exit(1);

    ArrayList<String> al3=new ArrayList<String>();
    al3.add("Tesla");
    al3.add("Rivian");
    //Adding second list elements to the first list at specific position
    // ArrayList1.addAll(index, ArrayList2);
    cars.addAll(1, al3);
    System.out.println(cars);

    // remove(index)
    cars.remove(0);
    System.out.println(cars);
    //System.exit(1);

    //Removing all the new elements from arraylist
    cars.removeAll(al2);
    System.out.println(cars);
    //System.exit(1);

    //Removing elements on the basis of specified condition
    //Here, we are using Lambda expression
    cars.removeIf(str -> str.contains("a"));   
    System.out.println(cars);
    //System.exit(1);

    //Removing all the elements available in the list

    // clear() will get rid all element
    cars.clear();
    System.out.println(cars);
    System.out.println(cars.size());
  }
}
