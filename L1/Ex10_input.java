import java.util.Scanner;

public class Ex10_input {

    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);

        System.out.print("Type something: ");
        line = in.nextLine();
        System.out.println("You said: " + line);

        System.out.print("Type full name: ");
        line = in.nextLine();
        System.out.println("You also said: " + line);

        System.out.print("Type full name: ");
        line = in.next();
        System.out.println("You also said: " + line);

        line = in.next();
        System.out.println("You also said: " + line);

        line = in.next();
        System.out.println("You also said: " + line);
        
        in.close();
    }
}

