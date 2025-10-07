class Honda extends Bike{
   void run(){ // error: final can not override
     System.out.println("running safely with 100kmph");
   }

   public static void main(String args[]){
       Honda honda= new Honda();
       honda.run();
       //Bike a = new Bike();
       //a.run();
   }
}
