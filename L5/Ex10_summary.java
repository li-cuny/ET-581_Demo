public class Ex10_summary {
  // function or method
  static void f1() {
    System.out.println("I just got executed!");
  }

  // function with Parameter
  static void f2(String fname) {
    System.out.println("Name: " + fname);
  }

  // Multiple Parameters
  static void f3(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  // Return Values
  static int f4(int x) {
    return 5 + x;
  }

  static int f5(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    f1();
    f1();
    f1();
    f2("Liam");
    f2("Jenny");
    f2("Anja");
    f3("Liam", 5);
    f3("Jenny", 8);
    f3("Anja", 31);
    System.out.println(f4(3));
    System.out.println(f5(10, 20));
  }
}
