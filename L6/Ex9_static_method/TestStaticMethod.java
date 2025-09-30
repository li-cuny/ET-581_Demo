//Test class to create and display the values of object
public class TestStaticMethod{
    public static void main(String args[]){
        System.out.println(Calculate.cube(8));
        Calculate a = new Calculate();
        System.out.println(a.square(5));
        System.out.println(a.cube(10));
        //System.out.println(Calculate.square(20)); // error

        //System.exit(1);

        //creating objects
        Student s1 = new Student(1,"Karan");
        Student s2 = new Student(2,"Aryan");
        Student s3 = new Student(3,"Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();

        s1.change("MIT");
        s1.display();
        s2.display();
        s3.display();

        Student.change("CIT");
        s1.display();
        s2.display();
        s3.display();

        s3.setCollege("NYIT");
        s1.display();
        s2.display();
        s3.display();

        s2.setName("Jack");
        s1.display();
        s2.display();
        s3.display();
    }
}
