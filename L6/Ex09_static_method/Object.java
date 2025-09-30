public class Object {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method - non-static
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }
  static int cube(int x){
      return x*x*x;
  }
  int square(int x){
    return x*x;
  }
  // Main method
  public static void main(String[] args) {
      myStaticMethod(); // Call the static method
      //myPublicMethod(); //This would compile an error

      Object myObj = new Object(); // Create an object of Main
      myObj.myPublicMethod(); // Call the public method on the object
      
      int result=Object.cube(5);
      System.out.println(result);
      System.out.println(cube(10));
      //System.exit(1);

      //System.out.println(square(10));
      //System.out.println(Object.square(10));
      Object a = new Object();
      result=a.square(5);
      System.out.println(result);
      //System.exit(1);
      
      System.out.println(a.cube(7));

  }
}