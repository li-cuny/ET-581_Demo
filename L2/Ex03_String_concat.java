public class Ex03_String_concat {
  public static void main(String[] args) {
    // string concatenation use + operator
    String s1 = "David";
    String s2 = "Brown";
    System.out.println(s1 + " " + s2);
    // will print out "David Brown"
    //System.exit(0);

    // string concatenation use concat()
    System.out.println(s1.concat(s2));
    // will print out "DavidBrown"

    System.out.println(s1.concat(" ").concat(s2));
    // will print out "David Brown"
    //System.exit(0);

    // Adding Numbers and Strings
    String x = "10";
    int y = 20;
    String z = x + y;
    // z will be 1020 (a String)
    System.out.println(z);
    //System.exit(0);

    System.out.println(x+1.1); // 101.1
    System.out.println(x+10+20+30); // 10102030
    System.out.println(x+(10+20+30)); // 1060
    //System.exit(0);

    int age = 10;
    System.out.println("My age is " + age);

    String txt = "nyc";
    System.out.println(txt);
    txt = txt.toUpperCase();
    System.out.println(txt);
    txt = txt.replace('Y','e').replace('C','w');
    System.out.println(txt);
  }
}

