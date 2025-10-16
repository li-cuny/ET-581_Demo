class Person{
    int id;
    String name;
    int age = 20; 
    Person(int id,String name){
        this.id=id;
        this.name=name;  
    }
    void message(){
        System.out.println("From Person class");
    }
}
