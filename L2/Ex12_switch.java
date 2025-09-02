import java.util.Scanner;
public class Ex12_switch {
  public static void main(String[] args) {
    // Switch Statements
    System.out.print("Enter your workday, 1-M,2-T,3-W,4-Th,5-F:");
    Scanner input = new Scanner(System.in);
    int day = input.nextInt();
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      default:
        System.out.println("Invalid option");
    }
    input.close();
  }
}
