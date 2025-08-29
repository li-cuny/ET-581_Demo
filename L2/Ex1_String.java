public class Ex1_String {
  public static void main(String[] args) {
    // primitive data type style
    String s1 = "example1";
    System.out.println(s1);

    String s2 = new String("example2");
    // creating Java string by new keyword
    // this statement create object i.e
    // first the object is created in heap
    // memory area and second the object is
    // created in String constant pool.
    System.out.println(s2);

    //int a = new int(10); // error
    //Integer a = new Integer(10); // warning
  }
}
