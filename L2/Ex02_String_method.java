public class Ex02_String_method {
  public static void main(String[] args) {
    // int length()
    String txt = "Hello World";
    System.out.println("Length of string: " + txt.length());

    // char charAt(int i)
    System.out.println(txt.charAt(0));
    System.out.println(txt.charAt(1));
    System.out.println(txt.charAt(2));
    System.out.println(txt.charAt(3));
    System.out.println(txt.charAt(4));
    System.out.println(txt.charAt(5));
    //System.exit(0);

    /*
    Exercise:
    Ask use enter firstname and lastname.
    Print the whole name, and print number of char of the full name.
    Print the initial of full name

    Example:
    Enter first name: David
    Enter last name: Brown
    Full name: David Brown
    Total char: 10
    Initial: D.B
    */

    // string toUpperCase()
    System.out.println(txt.toUpperCase());
    // Outputs "HELLO WORLD”

    // string toLowerCase()
    System.out.println(txt.toLowerCase());
    // Outputs "hello world”

    // how is the original txt
    System.out.println(txt);
    //System.exit(0);

    // The indexOf() method returns the index (the position)
    // of the first occurrence of a specified
    // text in a string (including whitespace)

    txt = "Please locate where 'locate' occurs!";

    System.out.println(txt.indexOf("locate")); // Outputs 7
    System.out.println(txt.indexOf("where"));
    System.out.println(txt.indexOf("e"));
    System.out.println(txt.indexOf("hello"));  // -1 if not found
    //System.exit(0);

    // int indexOf (String s, int i): 
    // Returns the index within the string
    // of the first occurrence of the specified string,
    // starting at the specified index.
    System.out.println(txt.indexOf("locate", 8));
    //System.exit(0);

    // int lastIndexOf( String s): 
    // Returns the index within the string of the
    // last occurrence of the specified string.

    System.out.println(txt.lastIndexOf("locate"));
    //System.exit(0);

    // String substring (int i): 
    // Return the substring from the ith index character to end.
    System.out.println(txt.substring(7));
    //System.exit(0);

    // String substring (int i, int j): 
    // Returns the substring from i to j-1 index.
    System.out.println(txt.substring(7,21));
    //System.exit(0);

    txt = "hello world";
    System.out.println(txt.substring(0,6));
    System.out.println(txt.substring(6));

    System.out.println(txt.substring(11));
    //System.exit(1);

    /*
    Exercise:
    Initialize a string "Hello New York City",
    Extract each word from the the string
    Hello
    New
    York
    City
    */

    // String replace (char oldChar, char newChar): 
    // Returns new string by replacing all occurrences
    // of oldChar with newChar.
    System.out.println(txt.replace('o','7'));
    System.out.println(txt.replace('l','0'));
    //System.exit(0);

    String s1 = "Hello";
    String s2 = "Hi";

    System.out.println(s1.equals(s2));
    System.out.println((s1!=s2));
    System.out.println((s1==s2));
    //System.exit(0);

    s2 = "HELLO";
    System.out.println(s1.equalsIgnoreCase(s2));
    //System.exit(0);

    System.out.println("== not same as .equal()");

    String s3 = new String("Hello");
    System.out.println(s1.equals(s3));
    System.out.println((s1!=s3));
    System.out.println((s1==s3));
    //System.exit(0);

    //Unicode value of 'e' is 101, 'E' is 69. diff is 32
    System.out.println(s1.compareTo(s2));
    System.out.println(s2.compareTo(s1));
    //System.exit(0);

    s1 = "        hello       world      ";
    System.out.println("[" + s1.trim() +"]");
  }
}
