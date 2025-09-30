//Java Program to demonstrate the use of static variable
//which get memory each time when we create an object of the class.

class Student{
   //will get memory each time when the instance is created
   int rollno;//instance variable
   String name;
   //will get memory only once and retain its value
   static String college ="CMU";//static variable
   //constructor
   Student(int r, String n){
       rollno = r;
       name = n;
   }
   //method to display the values
   void display (){System.out.println(rollno+" "+name+" "+college);}
}
