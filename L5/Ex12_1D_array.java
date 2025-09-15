public class Ex12_1D_array {
  // array as parameter to function
  static void output(int[] a) {
    for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
    System.out.println();
  }

  // update array in function
  static void update(int[] a) {
    for (int i = 0; i < a.length; i++)
      a[i] *= 10;
  }

  // create a new array obj with given size
  static int[] return_array(int size) {
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++)
      a[i] = i + 1;
    return a;
  }

  static void f(int n) {
    n = n * 10;
  }

  public static void main(String[] args) {
    int[] myNum = { 1, 2, 3, 4, 5 };
    output(myNum);
    update(myNum);
    output(myNum);
    int[] b = return_array(10);
    output(b);
    int a = 5;
    f(a);
    System.out.println(a);
    System.out.println(myNum);
  }
}
