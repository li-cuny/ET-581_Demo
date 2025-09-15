public class Ex11_Array_function {
  static void update(int[] a) {
    for (int i = 0; i < a.length; i++)
      a[i] = a[i] * 10;
  }

  static void update(int a) {
    a = a * 10;
  }

  public static void main(String[] args) {
    int b = 5;
    update(b);
    System.out.println(b);
    // System.exit(1);

    int[] a = { 1, 2, 3, 4 };
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }

    System.out.println();
    update(a);
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }

    System.out.println();

  }
}
