public class Ex04_Multi_Argument {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }
  public static void main(String[] args) {
    myMethod("Jack", 5);
    myMethod("Jenny", 8);
    myMethod("Anna", 31);
  }
}

