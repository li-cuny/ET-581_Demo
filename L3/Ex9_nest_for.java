public class Ex9_nest_for {
  public static void main(String[] args) {
    for(int i=0; i<10; i++){
        System.out.print("a ");
        for(int j=0; j < i; j++){
            System.out.print("c ");
        }
        System.out.print("b ");
    }
  }
}
