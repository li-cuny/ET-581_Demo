import java.util.Scanner;
public class Ex05_input {
  public static void main(String[] args) {
    int[] a = new int[5];
    for(int i=0;i<a.length;i++)
      System.out.println(a[i]);
    //System.exit(0);
    Scanner input = new Scanner(System.in);
    for(int i=0;i<a.length;i++){
      System.out.print("Enter array index "+i+":");
      a[i] = input.nextInt();
    }

    for(int i=0;i<a.length;i++)
      System.out.println(a[i]);
  }
}
