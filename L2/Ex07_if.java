import java.util.Scanner;
public class Ex7_if {
  public static void main(String[] args) {
    // block of code to be executed
    // if the condition is true
    Scanner input = new Scanner(System.in);
    System.out.print("Enter x:");
    int x = input.nextInt();
    System.out.print("Enter y:");
    int y = input.nextInt();
    if (x > y) {
      System.out.println(x + " is greater than " + y);
    } 
    System.out.println("This is not part of if");
  }
}
