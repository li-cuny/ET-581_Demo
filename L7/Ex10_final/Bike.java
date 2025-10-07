class Bike{
    int a;
    final void run(){
      a = 20;
      System.out.println("Bike is running");
    }
    public static void main(String args[]){
        Bike b = new Bike();
        b.run();
    }
}
