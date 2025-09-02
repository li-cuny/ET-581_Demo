import java.util.Scanner;
public class Ex08_else {
  public static void main(String[] args) {
    // block of code to be executed
    // if the condition is true
    Scanner input = new Scanner(System.in);

    // if-else
    System.out.print("Enter time:");
    int time = input.nextInt();
    if (time < 18) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }
  }
}
