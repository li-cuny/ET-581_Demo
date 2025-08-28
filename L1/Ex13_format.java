import java.util.Scanner;
public class Ex12_format {

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = in.nextInt();
        System.out.print("Enter month:");
        int month = in.nextInt();
        System.out.print("Enter day:");
        int day = in.nextInt();
        System.out.printf("%d-%d-%d\n",year,month,day);
        System.out.printf("%4d/%2d/%2d\n",year,month,day);
        // year-month-day
        System.out.println(year+"-"+month+"-"+day);*/

        /*System.out.print("Enter month:");
        int hour = in.nextInt();
        System.out.print("Enter day:");
        int minute = in.nextInt();
        System.out.printf("%2d:%2d\n",hour,minute);*/

        double money = 1200000.1;
        System.out.printf("$%.10f\n",money);
        System.out.printf("$%f\n",money);
        System.out.printf("$%10f\n",money);
        System.out.printf("$%.4f\n",money);
        System.out.printf("$%.10g\n",money);
        System.out.printf("$%g\n",money);
        System.out.printf("$%10g\n",money);

        int n = 100;
        System.out.printf("$%d\n",n);
        System.out.printf("$%10d\n",n);

        String s1 = "hello";
        String s2 = "world";
        System.out.printf("%s %s\n",s1,s2);
    }
}
