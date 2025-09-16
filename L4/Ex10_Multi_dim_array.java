public class Ex10_Multi_dim_array {
  public static void main(String[] args) {
    int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } }; // a[2][3]
    /*
     * 1 2 3
     * 4 5 6
     */
    System.out.println(a.length);
    System.out.println(a[0].length);
    System.out.println("a[0][0]:" + a[0][0]);
    System.out.println("a[0][1]:" + a[0][1]);
    System.out.println("a[0][2]:" + a[0][2]);
    System.out.println("a[1][0]:" + a[1][0]);
    System.out.println("a[1][1]:" + a[1][1]);
    System.out.println("a[1][2]:" + a[1][2]);

    int[][] b = new int[3][2];
    System.out.println("b[0][0]:" + b[0][0]);
    System.out.println("b[0][1]:" + b[0][1]);
    System.out.println("b[1][0]:" + b[1][0]);

  }
}
