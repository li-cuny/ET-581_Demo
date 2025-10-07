class Vehicle{
    int speed;

    Vehicle(){System.out.println("speed is "+speed);}
    // block will be excuted first
    {
        speed=100;
        System.out.println("Vehicle instance initializer block invoked");
    }

    public static void main(String args[]){
        Vehicle b1=new Vehicle();
        Vehicle b2=new Vehicle();
    }
}
