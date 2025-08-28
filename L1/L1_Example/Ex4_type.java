public class Ex4_type {
  public static void main(String[] args) {

    // whole number
    byte a1 = 127;
    System.out.println(a1);


    //a1 = 200; // compilation error
    //a1 = -128;
    System.out.println(a1);

    short a2 = 32767;
    System.out.println(a2);
    //a2 = 32768;

    int a3 = 2147483647;
    System.out.println(a3);

    long a4 = 9223372036854775807L;
    System.out.println(a4);
    //System.exit(0);

    // numbers with decimals
    float b1 = 3.1415926535f; // add additional f
    System.out.println(b1);

    //b1 = 1.1;  // error because of missing f
    System.out.println(b1);

    double b2 = 3.1415926535888888888d; // add additional d
    System.out.println(b2);
    
    b2 = 1.5;
    System.out.println(b2);
    //System.exit(0);

    //long double b3 = 1.15; // error no long double in java


    // char - single charactor
    char d = 'A'; // A-Z, a-z, 0-9, , . ?
    d = '?';
    d = '1';
    d = 'a';
    d = ' ';
    d = '\t';
    d = '\n';
    d = '\u4E54'; //乔
    System.out.println(d);
    d = '\u0041'; //A
    System.out.println(d);
    d = '\uAC00'; //가
    System.out.println(d);
    d = '\u3051'; //け
    System.out.println(d);
    //System.exit(1);

    // boolean - true or false
    boolean c = true;
    System.out.println(c);

    c = false;
    System.out.println(c);
    //System.exit(1);

    // String - sequence of charactor
    // String is not primitive type
    // String is Object
    String e = "Hello world";
    System.out.println(e);

    //System.out.println(e[0]);
    // java doess not support index for string
    // 0123456
    //"Hello world"
    System.out.println(e.charAt(0));
    System.out.println(e.charAt(1));
    System.out.println(e.charAt(6));
    //System.exit(1);

    // how to find the bytes of different primitive data types
    System.out.println("byte " + Byte.BYTES);
    System.out.println("char " + Character.BYTES);
    System.out.println("int " + Integer.BYTES);
    System.out.println("long " + Long.BYTES);
    System.out.println("short " + Short.BYTES);
    System.out.println("double " + Double.BYTES);
    System.out.println("float " + Float.BYTES);
    //System.out.println("boolean " + Boolean.BYTES);
  }
}

