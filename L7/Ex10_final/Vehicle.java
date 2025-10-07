class Vehicle{
   final int speedlimit=90;//final variable
   void run(){
      speedlimit=400; // error: can not change final var
   }
   public static void main(String args[]){
       Vehicle obj=new  Vehicle();
       obj.run();
   }
}//end of class
