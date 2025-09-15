public class Ex06_non_void {
  static int sum(int a,int b){
    return a + b;
  }
  public static void main(String[] args) {
    System.out.println(sum(10,20));
    System.out.println(sum(100,200));
    int a = sum(30,40);
    System.out.println(a);
    //System.out.println(sum(1.5,2.5)); // error
    System.out.println(sum((int)1.5,(int)2.5)); // manual convert
    //System.out.println(sum('A','B')); // is this work 
  }
}
