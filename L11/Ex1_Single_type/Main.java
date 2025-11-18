// Driver class to test above
class Main {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
 
        // instance of String type
        Test<String> sObj= new Test<String>("Hello world");
        System.out.println(sObj.getObject());
    }
}