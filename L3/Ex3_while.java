import java.util.Scanner;
public class Ex3_while {
  public static void main(String[] args) {
    System.out.print("Enter a positive number:");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    while(n<=0){
      System.out.print("Invalid, enter a positive number:");
      n = input.nextInt();
    }
    System.out.println("You entered "+n);
  }
}
