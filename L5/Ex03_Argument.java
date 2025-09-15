public class Ex03_Argument {
  static void print_hello(String name){
    System.out.println("Hello " + name);
  }
  public static void main(String[] args) {
    print_hello("David");
    print_hello("Brian");
    print_hello("Jack");
    //print_hello(1);
  }
}
