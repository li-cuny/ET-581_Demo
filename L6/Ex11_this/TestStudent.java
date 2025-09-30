class TestStudent{
    public static void main(String args[]){
        Student s1=new Student(111,"ankit","java");
        Student s2=new Student(112,"sumit","java",6000f);
        s1.display();
        s2.display();

        Student s3 = s1;
        s3.display();
    }
}
