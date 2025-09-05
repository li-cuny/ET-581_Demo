public class Ex7_continue {
  public static void main(String[] args) {
    // for loop
    for (int i = 0; i < 100; i++) {
      if (i%7==0) continue;
        System.out.print(i+" ");
    }
    System.out.println();
  }
}
