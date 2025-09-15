public class Ex07_non_void {
  static double sum(double a,double b){
    return a + b;
  }
  public static void main(String[] args) {
    System.out.println(sum(1.5,2.5));
    double a = sum(8.7,1.2);
    System.out.println(a);
    System.out.println(sum(10,20)); // automatic convert
  }
}
