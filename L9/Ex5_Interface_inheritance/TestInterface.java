class TestInterface implements Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        TestInterface obj = new TestInterface();
        obj.print();
        obj.show();  
    }
}
