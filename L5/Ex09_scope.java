public class Ex09_scope {
  public static void main(String[] args) {
    // Code here CANNOT use x
    // System.out.println(x);
    int x = 10;
    // Code here can use x
    System.out.println(x);

    // Code here CANNOT use y
    {
      // int x = 20;
      System.out.println(x);
      // This is a block
      // Code here CANNOT use y
      int y = 20;
      // Code here CAN use y
      System.out.println(y);
    } // The block ends here
    // Code here CANNOT use y
    // System.out.println(y);
    int y = 30;
    System.out.println(y);
    {
      //int x = 40; // error, can not define again
    }
  }
}
