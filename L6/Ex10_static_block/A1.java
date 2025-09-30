class A1{
  public static void main(String args[]){
    System.out.println("Hello main");
    int a = 10;
    {
        System.out.println(a);
        int b = 20;
        System.out.println(b);
    }
    //System.out.println(b);
  }
}
