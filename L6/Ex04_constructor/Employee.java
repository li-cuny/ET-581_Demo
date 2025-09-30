class Employee{
    int id;
    String name;
    float salary;
    // contructor: name of contructor same as name of class
    //creating a parameterized constructor
    //creating three arg constructor
    Employee(int i, String n, float s) {
        //System.out.println("Creating Employee");
        id=i;
        name=n;
        salary=s;
    }
    //creating two arg constructor
    Employee(int i, String n) {
        id=i;
        name=n;
        salary=10;
    }
    Employee(String n,int i) {
        id=i;
        name=n;
        salary=10;
    }
    Employee(int i) {
        id=i;
        name="Unknown";
        salary=0;
    }
    Employee(String n) {
        id=0;
        name=n;
        salary=0;
    }
    // default construtcor
    Employee() {
        id=0;
        name="Unknown";
        salary=0;
    }
    void display(){System.out.println(id+" "+name+" "+salary);}
}
