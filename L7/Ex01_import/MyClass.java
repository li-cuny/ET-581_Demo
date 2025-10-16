//import java.util.Scanner; // import only Scanner class
import java.util.*; // import java.util package

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);

    System.out.println("Enter username");
    int n = myObj.nextInt();
    System.out.println(1/n);
  }
}
