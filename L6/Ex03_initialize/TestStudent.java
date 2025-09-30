class TestStudent{
   public static void main(String args[]){
      Student s1=new Student();
      Student s2=new Student();
      s1.displayInformation();
      s2.displayInformation();
      s1.insertRecord(111,"Jack");
      s2.insertRecord(222,"David");
      s1.displayInformation();
      s2.displayInformation();
   }
}
