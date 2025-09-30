public class Person {
  private String name; // private = restricted access
  Person(){
    name = "Unknown";
  }
  Person(String name){
    this.name = name;
    //name = n;
  }

  // Getter || accessor
  public String getName() {
    return name;
  }

  // Setter || mutator
  public void setName(String newName) {
    this.name = newName;
  }
  // ssn no set, no get
  // name no set, yes get
  // passwd yes set, no get
  // address yes set, yes get
}
