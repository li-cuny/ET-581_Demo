import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Ex5_ArrayList {
  public static void f1(int [] a){
    for(int i=0;i<a.length;i++) a[i] *= 10;
  }
  public static void main(String[] args) {
    int [] a = {1,2,3};
    f1(a);
    for(int i=0;i<a.length;i++) 
      System.out.print(a[i]+" ");
    System.out.println();
    //System.exit(1);
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    f(cars);
    System.out.println(cars);
  }
  public static void f(ArrayList<String> a){
    for (int i = 0; i < a.size(); i++) {
      a.set(i,"Toyota");
    }
  }
}
