// Arithmatic operation
public class Ex6_arithmetic {
  public static void main(String[] args) {

    System.out.println("Postfix vs prefix ++");
    int i=1;
    i++; // i = i + 1; // postfix
    System.out.println(i);
    ++i; // i = i + 1; // prefix
    System.out.println(i);
    //System.exit(1);

    System.out.println("------Postfix---------");
    i = 1;
    System.out.println(i++);
    System.out.println(i);
    //System.exit(1);

    i = 1;
    System.out.println("------prefix---------");
    System.out.println(++i);
    System.out.println(i);
    //System.exit(1);

    //return;

    System.out.println("Postfix vs prefix --");
    i--; // i = i-1;
    System.out.println(i);

    --i; // i = i-1;
    System.out.println(i);

    System.out.println("------Postfix---------");
    System.out.println(i--);
    System.out.println(i);

    System.out.println("------prefix---------");
    System.out.println(--i);
    System.out.println(i);

    System.out.println("----Exercise-------");

    int a = 3, b = 2, c = 1, x = 1, y = 1;
    System.out.println(++c * (a++ - --b) / (++x + ++y));
    //System.exit(1);
    
    System.out.println(a + " " + b + " " + c + " " + x + " " + y);
    //System.exit(1);

    int k = 2;
    k += 2; // k = k + 2;
    k += 10; // k = k + 10;

    int n1 = 11;
    int n2 = 2;
    System.out.println(n1+"/"+n2+"=" + n1/n2);

    System.out.println(10/3.0); // int / double => double
    System.out.println(10.0/3); // double / int => double
    System.out.println(10.0/3.0); // double / double => double
    System.out.println(10/3);   // int / int => int
  }
}
