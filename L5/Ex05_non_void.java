public class Ex05_non_void {
  static int timeten(int n) {
    return n * 10;
  }

  public static void main(String[] args) {
    System.out.println(timeten(10));
    System.out.println(timeten(5));
    int a = timeten(3);
    System.out.println(a);
    timeten(50);
  }
}
