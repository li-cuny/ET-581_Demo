class TestAbstraction{
    public static void main(String args[]){
        // create an object of the Circle class 
        // (which inherits attributes and methods from Main)
        Shape s=new Circle();//In a real scenario, 
        // object is provided through method, e.g., getShape() method
        s.draw(); // call abstract method
        s.print();
        s = new Rectangle();
        s.draw(); // call abstract method
        s.print();
    }
}