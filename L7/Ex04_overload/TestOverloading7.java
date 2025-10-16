class TestOverloading7{
    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,int b){System.out.println("b method invoked");}
    public static void main(String args[]){
        TestOverloading7 obj=new TestOverloading7();
        //obj.sum(20,20);//now ambiguity
        obj.sum(20L,20);
        obj.sum(20,20L);
        //obj.sum(20L,20L); //now ambiguity
    }
}
