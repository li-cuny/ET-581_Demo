// name of variable
public class Ex3_variable {
  public static void main(String[] args) {
    // type variable_name = value;
    int b = 10; // recommended
    System.out.println(b);

    int b1; // possible
    //System.out.println(b1);  // error
    b1 = 10;
    System.out.println(b1);

    // Must start with a letter or the underscore or $ character
    int a, _a, $a;
    //int 1a = 10;

    // Must not have any space in the name
    //int age of you = 100;
    int age_of_you = 100;

    // Can not have special characters except $ or _
    //int amount? = 200;
    int a$b = 100;
    int a_b = 100;

    // Must not be a keyword
    //int if = 11;
    //int print = 12;
    int if1 = 11;

    // Variable names are case-sensitive
    int Amount = 2000;
    int amount = 3000;
    System.out.println(Amount);
    System.out.println(amount);

    // Suggestions for variable names
    // Variable names should be meaningful
    // Variable names should be easy to read and write
    // int a = 10;
    int age = 10;
    //int ps335_grade4_classs2_david_age = 10;
    System.out.println(age);
  }
}
