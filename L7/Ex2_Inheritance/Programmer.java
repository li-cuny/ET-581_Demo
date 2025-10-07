class Programmer extends Employee{
   int bonus;
   Programmer(){
     super();
     bonus = 0;
   }
   Programmer(float s,int b){
     super(s);
     bonus = b;
   }
   Programmer(float s,float r,int b){
     super(s,r);
     bonus = b;
   }
   void info(){
     System.out.println("Programmer salary is: "+ salary);
     System.out.println("Bonus of Programmer is: "+ bonus);
     //System.out.println("Programmer Reloacation fee is:" + relocationfee);
     System.out.println("Programmer Reloacation fee is: "+this.getRelocationfee());
   }
   /*void display(){
      System.out.println(bonus);
    }*/
   public static void main(String args[]){
       Programmer p=new Programmer(200000,150000);
       p.info();
       Programmer p1=new Programmer();
       p1.info();
       Programmer p2=new Programmer(300000,50000,150000);
       p2.info();
       Employee e = new Employee(50000);
       e.info();
      
       //Employee x = new Programmer(200000,150000);
       //x.display();

   }
}
