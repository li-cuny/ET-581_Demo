class TestOverloading3{
  static int add(int a,int b){return a+b;}
  static double add(int a,int b){return a+b;}
  public static void main(String[] args){
    // ambiguity
    System.out.println(add(11,11));
  }
}
