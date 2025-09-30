public class Main {
  public static void main(String[] args) {
    Person p1 = new Person();
    System.out.println("Name: " + p1.fname + " " + p1.lname);
    System.out.println("Age: " + p1.age);

    Person p2 = new Person();
    System.out.println("Name: " + p2.fname + " " + p2.lname);
    System.out.println("Age: " + p2.age);

    p1.lname = "Jack";
    p1.fname = "Brown";
    p1.age = 30;

    System.out.println("Name: " + p1.fname + " " + p1.lname);
    System.out.println("Age: " + p1.age);

    System.out.println("Name: " + p2.fname + " " + p2.lname);
    System.out.println("Age: " + p2.age);
  }
}
/*
Create a class call Employee, which contain name and id.
int main function create two instances of employee

first employee' name is "Jack", id is 123456
second employee' name is "David", id is 888888
Print each employees name and id to screen
*/