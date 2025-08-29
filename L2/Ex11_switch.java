import java.util.Scanner;
public class Ex11_switch {
  public static void main(String[] args) {
    System.out.print("Enter your workday, 1-M,2-T,3-W,4-Th,5-F:");
    Scanner input = new Scanner(System.in);
    int option = input.nextInt();
    if(option == 1) System.out.println("Monday");
    else if(option == 2) System.out.println("Tue");
    else if(option == 3) System.out.println("Wed");
    else if(option == 4) System.out.println("Thu");
    else if(option == 5) System.out.println("Fri");
  }
}
