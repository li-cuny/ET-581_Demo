class Bike extends Vehicle{
    
    Bike(){
        super(); // 1
        System.out.println("child class constructor invoked");
    }
    Bike(int a){
        super();
        System.out.println("Bike child class constructor invoked "+a);
    }
    
    // block will be excuted after super()
    {System.out.println("instance initializer block is invoked");} //2

    public static void main(String args[]){
        Bike b=new Bike();
        Bike c=new Bike(50);
    }
}
