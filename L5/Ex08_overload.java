public class Ex08_overload {
  static double sum(double a, double b) {
    return a + b;
  }

  /*
   * static int sum(int a,int b){
   * return a + b;
   * }
   */
  static String sum(String a, String b) {
    return a + b;
  }

  static int sum(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    System.out.println(sum(1.5, 2.5));
    System.out.println(sum(10, 20)); // automatic convert
    System.out.println(sum(100, 200));
    System.out.println(sum(1.5, 10)); // which sum will be called?
    System.out.println(sum("Hello", "World"));
    System.out.println(sum(10, 20, 30));
  }
}
