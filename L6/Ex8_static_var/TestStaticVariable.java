public class TestStaticVariable{
   public static void main(String args[]){
       Student s1 = new Student(111,"Jack");
       Student s2 = new Student(222,"David");
       s1.display();
       s2.display();
       //we can change the college of all objects by the single line of code
       Student.college="MIT";
       System.out.println(Student.college);

       //System.out.println(Student.name); // error
       System.out.println(s1.name);
       System.out.println(s1.college);
       System.out.println(s2.college);
       s1.college = "NYU";
       System.out.println(s1.college);
       System.out.println(s2.college);
       System.out.println(Student.college);
       System.exit(1);

       s1.name = "Kate";
       System.out.println(s1.name);
       System.out.println(s2.name);
       s2.name = "Jack";
       System.out.println(s1.name);
       System.out.println(s2.name);
   }
}
