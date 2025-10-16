class Main {
  public static void main(String args[]){
      Bike obj=new Bike();
      System.out.println(obj.speedlimit);//90
      System.out.println(obj.getSpeed());
      obj.run();
      //System.exit(1);
      obj=new Honda();
      System.out.println(obj.speedlimit);
      System.out.println(obj.getSpeed());
      obj.run(); 
   }
   /*
   We are accessing the data member
   by the reference variable of Parent
   class which refers to the subclass object.
   Since we are accessing the data member
   which is not overridden, hence it will
   access the data member of the Parent
   class always.
   */
}