import java.util.ArrayList; // import the ArrayList class
//import java.util.*
public class Ex1_ArrayList {
  public static void main(String[] args) {
    // array
    int size = 10;
    int [] a = new int[size];
    for(int i=0;i<size;i++) a[i] = i+1;
    size = 20;
    a = new int[size];
    for(int i=0;i<size;i++)
      System.out.print(a[i]+" ");
    System.out.println();
    //System.exit(1);

    // string array
    String [] b = {"Volvo","BMW","Ford"};
    System.out.println(b);
    System.out.println(b[0]);
    b[0] ="Opel";
    System.out.println(b[1]);
    System.out.println(b[2]);
    //System.exit(1);

    // ArrayList flexible
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    System.out.println(cars.get(0));
    System.out.println(cars.get(1));
    System.out.println(cars.get(2));
    //System.exit(1);
  }
}
