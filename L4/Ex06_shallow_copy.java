
public class Ex06_shallow_copy {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4 };
    for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + " "); // 1 2 3 4
    System.out.println();
    int[] b = a; // shallow copy
    for (int i = 0; i < b.length; i++)
      System.out.print(b[i] + " "); // 1 2 3 4
    System.out.println();
    // System.exit(0);

    a[0] = 10;

    for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + " "); // 10 2 3 4?
    System.out.println();
    for (int i = 0; i < b.length; i++)
      System.out.print(b[i] + " "); // 1 2 3 4?
    System.out.println();
    // System.exit(0);

    b[1] = 200;

    for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + " "); // 10 2 3 4?
    System.out.println();
    for (int i = 0; i < b.length; i++)
      System.out.print(b[i] + " "); // 1 200 3 4?
    System.out.println();
    // System.exit(0);

    // how other var works
    int x = 10;
    int y = x;
    System.out.println("x:" + x);
    System.out.println("y:" + y);

    x = 20;
    System.out.println("x:" + x);
    System.out.println("y:" + y);

  }
}
