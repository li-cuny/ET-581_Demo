public class Ex04_for_each {
  public static void main(String[] args) {
    // Array
    // type [] var = {values};
    int[] myNum = {1,2,3,4};
    for(int i:myNum)
      System.out.println(i);
    //System.exit(1);
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for(String i:cars)
      System.out.println(i);
    //System.exit(1);
    // limitation of for each loop
    for(int i:myNum)
      i *= 10;
    for(int i:myNum)
      System.out.print(i+" ");
    System.out.println();
    //System.exit(1);
    
    // update array have to use index for loop
    int [] a = {1,2,4,5};
    for(int i=0;i<a.length;i++)
      a[i] *=10;
    for(int i=0;i<a.length;i++)
      System.out.print(a[i]+" ");
    System.out.println();
  }
}
