class TestOverloading5{
    void sum(int a,long b){System.out.println(a+b);}
    void sum(int a,int b,int c){System.out.println(a+b+c);}

    public static void main(String args[]){
        //sum(10,20);
        TestOverloading5 obj=new TestOverloading5();
        obj.sum(20,20);//now second int literal will be promoted to long
        obj.sum(20,20,20);
    }
}