public class TryCatchExample3 {

    public static void main(String[] args) {
        try {
            int data=50/0; //may throw exception
                            // if exception occurs, the remaining statement will not exceute
            System.out.println("rest of the code");
        }catch(ArithmeticException e){
             // handling the exception
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }  
}
