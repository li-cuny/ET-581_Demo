import java.util.Scanner;

class Ex9_input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Getting int input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);


        System.out.print("Enter boolean:");
        boolean myBool = input.nextBoolean();
        System.out.println("Boolean entered = " + myBool);

        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);

        // char
        System.out.print("Enter a char:");
        char myChar = input.next().charAt(0);
        System.out.println("Char entered = " + myChar);

        input.close();
    }
}
