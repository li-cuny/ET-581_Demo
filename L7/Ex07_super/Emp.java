class Emp extends Person{
    float salary;
    int age = 30;
    // super have to be in the first line of child constructor
    Emp(int id,String name,float salary){
        super(id,name);//reusing parent constructor
        this.salary=salary;  
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
        System.out.println(age);
        System.out.println(super.age);
        message();  // From Employee class
        this.message();  // From Employee class
        super.message(); //From Person class
    }
    void message(){
        System.out.println("From Employee class");
    }
}
