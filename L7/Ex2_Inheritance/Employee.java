class Employee{
    public float salary;
    private float relocationfee;
    Employee(float s){
      salary = s;
      relocationfee = 0;
    }
    Employee(float s,float r){
      salary = s;
      relocationfee = r;
    }
    Employee(){
      salary = 0;
      relocationfee = 0;
    }
    float getRelocationfee(){
      return relocationfee;
    }
    void info(){
      System.out.println("Emplyee salary is: "+salary);
      System.out.println("Emplyee Reloacation fee is: "+relocationfee);
    }
    /*private void display(){
      System.out.println(salary + " " + relocationfee);
    }*/
}
