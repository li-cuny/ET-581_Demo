class TestOverloading1{
  static int add(int a,int b){return a+b;}
  static int add(int a,int b,int c){return a+b+c;}
  static double add(double a,double b){return a+b;}

  public static void main(String[] args){
      System.out.println(add(11,11));
      System.out.println(add(11,11,11));
      System.out.println(add(1.1,1.1));
      System.out.println(add(1,1.1));
      //System.out.println(add(1.1,1.1,1.1));
  }
}