
public class Ex07_deep_copy_1 {
  public static void main(String[] args) {
    int[] a = {1,2,3,4};
    int[] b = new int[a.length];
    for(int i=0;i<a.length;i++){ // deep copy
      b[i] = a[i];
    }

    for(int i=0;i<a.length;i++)
      System.out.print(a[i]+" "); // 1 2 3 4
    System.out.println();

    for(int i=0;i<b.length;i++)
      System.out.print(b[i]+" "); // 1 2 3 4
    System.out.println();

    a[0] = 10;

    for(int i=0;i<a.length;i++)
      System.out.print(a[i]+" "); // 10 2 3 4?
    System.out.println();
    for(int i=0;i<b.length;i++)
      System.out.print(b[i]+" "); // 1 2 3 4?
    System.out.println();

    b[1] = 200;

    for(int i=0;i<a.length;i++)
      System.out.print(a[i]+" "); // 10 2 3 4?
    System.out.println();
    for(int i=0;i<b.length;i++)
      System.out.print(b[i]+" "); // 1 200 3 4?
    System.out.println();

  }
}
