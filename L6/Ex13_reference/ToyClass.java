public class ToyClass {
  private String name;
  private int number;
  public ToyClass(String initialName, int initialNumber){
    name = initialName;
    number = initialNumber;
  }
  public ToyClass(){
    name = "No name yet.";
    number = 0;
  }
  public void set(String newName, int newNumber){
    name = newName;
    number = newNumber;
  }
  public String toString(){
    //return "Hello world";
    return (name + " " + number);
  }
  public static void changer(ToyClass aParameter){
    aParameter.name = "Hot Shot";
    aParameter.number = 42;
  }
  public boolean equals(ToyClass otherObject){
    return (name.equals(otherObject.name));
  }
  public static void main(String[] args) {
    // Primitive type
    int a = 10;
    int b = a;
    b = 20;
    System.out.println(a);
    System.out.println(b);
    //System.exit(1);

    // reference type
    ToyClass variable1 = new ToyClass("Joe", 42);
    System.out.println(variable1);
    ToyClass variable3 = new ToyClass("Jack", 20);
    System.out.println(variable3);
    //System.exit(1);

    ToyClass variable2;
    variable2 = variable1; //Now both variables name the same object.
    variable2.set("Joseph", 1);
    System.out.println(variable2);
    System.out.println(variable1); //Invokes variable1's toString
    //System.exit(1);
    
    a = 50;
    Integer c = a;
    Integer d = c;
    c = 30;
    a= 15;
    System.out.println(c);
    System.out.println(d);
    
  }
}
