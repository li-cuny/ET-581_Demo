public class Ex02_escape_char {
  public static void main(String[] args) {
    // escape charactor "\n" "\t"
    System.out.print ("Hello\nWorld\n");
    System.out.print ("Hello\tWorld\n\n");


    System.out.println();
    System.out.print("item price\n");
    System.out.print("banana $1.9\n");
    System.out.print("apple $2.9\n");
    System.out.println();

    System.out.println();
    System.out.print("item\tprice\n");
    System.out.print("banana\t$1.9\n");
    System.out.print("apple\t$2.9\n");
    System.out.println();

    System.out.print("item\tprice\nbanana\t$1.9\napple\t$2.9\n\n");

    System.out.print("item\tprice\n");
    System.out.print("This item is very long\t$2.9\n");
    System.out.print("apple\t$2.9\n\n");

    System.out.print("item\t\t\tprice\n");
    System.out.print("This item is very long\t$2.9\n");
    System.out.print("apple\t\t\t$2.9\n\n");

    System.out.print("\\* This is not\n a comment *\\");

    // single line comment

    /*
    This
    is
    multi line
    comment
    */
  }
}

