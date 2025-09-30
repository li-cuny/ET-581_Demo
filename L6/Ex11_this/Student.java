class Student{
  int rollno;
  String name,course;
  float fee;
  Student(int rollno, String name,String course){
      this.rollno=rollno;
      this.name=name;
      this.course=course;
  }
  
  Student(int rollno,String name,String course,float fee){
      this(rollno,name,course);//reusing constructor
      //Student(rollno,name,course);
      this.fee=fee;
  }
  // error: call to this must be first statement in constructor
  /*Student(int rollno,String name,String course,float fee){
      this.fee=fee;
      this(rollno,name,course);//C.T.Error
  }*/
  void display(){
    System.out.println(rollno+" "+name+" "+course+" "+fee);
    System.out.println(this);
  }
}
