//Java Program to demonstrate the use of a static method.
class Student{
     int id;
     String name;
     static String college = "IIT";
     //static method to change the value of static variable
     static void change(String n){
        college = n;
     }
     void setCollege(String c){
      college = c;
     }
     //constructor to initialize the variable
     Student(int r, String n){
         id = r;
         name = n;
     }
     void setName(String n){
       name = n;
     }
     //method to display values
     void display(){System.out.println(id+" "+name+" "+college);}
}
