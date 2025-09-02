import java.util.Scanner;
public class Ex09_if {
  public static void main(String[] args) {
    // block of code to be executed
    // if the condition is true
    System.out.print("Enter time: ");
    Scanner input = new Scanner(System.in);

    // if-else-if-else
    int time = input.nextInt();
    if (time < 10) {
      System.out.println("Good morning.");
    } else if (time < 20) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }
    input.close();
  }
}
