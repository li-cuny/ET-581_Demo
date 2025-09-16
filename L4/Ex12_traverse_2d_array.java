
public class Ex12_traverse_2d_array {
  public static void main(String[] args) {
    int[][] a = { { 1, 2 }, { 4, 5, 6, 7 }, { 7, 8, 9 } };
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }

    // Multidimensional Arrays
    int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9 } };
    int x = myNumbers[1][2];
    System.out.println(x); // Outputs 7
    for (int i = 0; i < myNumbers.length; ++i) {
      for (int j = 0; j < myNumbers[i].length; ++j) {
        System.out.print(myNumbers[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println(myNumbers[0].length);
    System.out.println(myNumbers[1].length);
    System.out.println(myNumbers[2].length);
  }
}
