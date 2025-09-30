public class Main {
  public static void main(String[] args) {
    // boxing
    Integer n1 = new Integer(47);
    Double p1 = new Double(499.99);
    Character g1 = new Character('A');
    System.out.println(n1);
    System.out.println(p1);
    System.out.println(g1);
    //System.exit(1);
    
    // automatic boxing
    Integer n2 = 47;
    Double p2 = 499.99;
    Character g2 = 'A';
    System.out.println(n2);
    System.out.println(p2);
    System.out.println(g2);

    // automatic unboxing
    int n = n1;
    double d = p1;
    char c = g1;
    System.out.println(n);
    System.out.println(d);
    System.out.println(c);
  }
}
