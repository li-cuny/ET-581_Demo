public class Ex03_for {
  public static void main(String[] args) {
    // Array
    // type [] var = {values};
    int[] myNum = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    for (int i = 0; i < myNum.length; i++) {
      System.out.println(i + " " + myNum[i]);
    }

    // System.exit(1);

    String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
    for (int i = 0; i < cars.length; i++) {
      System.out.println(i + " " + cars[i]);
    }

    // could update array use indexed for loop
    for (int i = 0; i < myNum.length; i++) {
      myNum[i] *= 10;
    }

    for (int i = 0; i < myNum.length; i++) {
      System.out.println(i + " " + myNum[i]);
    }

  }
}
