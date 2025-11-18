// Driver class to test above
class Main
{
    public static void main (String[] args)
    {
        Test <String, Integer> obj1 = new Test<String, Integer>("Hello", 10);
        obj1.print();

        Test <Double, String> obj2 = new Test<Double, String>(3.14, "Pi");
        obj2.print();
    }
}