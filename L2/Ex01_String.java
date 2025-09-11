import java.util.StringTokenizer;

public class Ex01_String {
  public static void main(String[] args) {
    // primitive data type style
    String s1 = "example1";
    System.out.println(s1);

    // Creating an object from a class definition (instantiation)
    // ClassName obj = new ClassName(/* constructor parameters if needed */);
    String s2 = new String("example2");
    // creating Java string by new keyword
    // this statement create object i.e
    // first the object is created in heap
    // memory area and second the object is
    // created in String constant pool.
    System.out.println(s2);
    int number = 2;
boolean isNumberEven;
if (number % 2 == 0) {
    isNumberEven = true;
    System.out.println("Even number");
} else {
    isNumberEven = false;
    System.out.println("Odd number");
}
 String sentence = "Hello world Java";

StringTokenizer st1 = new StringTokenizer(sentence);// default delimiter " " space
System.out.println(st1.nextToken()); // Hello
System.out.println(st1.nextToken()); // apple
System.out.println(st1.nextToken()); // Hello
System.out.println(st1.nextToken()); // apple
System.out.println(st1.nextToken()); // Hello
System.out.println(st1.nextToken()); // apple

String data = "apple,banana,orange";
StringTokenizer st2 = new StringTokenizer(data, ","); // using "," as separator
System.out.println(st2.nextToken()); // apple
System.out.println(st2.nextToken()); // apple
  }
}
