public class Ex01_array {
  public static void main(String[] args) {
    // Array is a collection of similar type of elements
    // type [] var = new type[size];
    int [] a = new int[10];
    // type [] var = {values};
    int [] myNum = {10, 20, 30, 40};
    // print array itself will not show the values
    // instead it will show the memory location
    System.out.println(myNum);
    System.out.println(myNum.length);
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars);
    System.out.println(cars.length);
  }
}
