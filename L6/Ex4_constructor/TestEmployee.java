public class TestEmployee {
    public static void main(String[] args) {
        // default constrcutor
        Employee e5=new Employee();
        e5.display();
        Employee e4=new Employee("Sam");
        e4.display();
        Employee e3=new Employee(110);
        e3.display();
        Employee e2=new Employee(102,"David");
        e2.display();
        Employee e6=new Employee("Amar",120);
        e6.display();
        
        Employee e1=new Employee(101,"Jack",45000); 
        e1.display();
        System.exit(1);
    }
}

