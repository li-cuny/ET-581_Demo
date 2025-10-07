public class Main
{
    // main method
    public static void main(String argvs[])
    {
       A1 a1 = new A1();
       // this is ok
       a1.foo().print();

       A2 a2 = new A2();
       // we need to do the type casting to make it
       // more clear to reader about the kind of object created
       a2.foo().print();
       ((A2)a2.foo()).print();

       A3 a3 = new A3();

       // doing the type casting
       a3.foo().print();
       ((A3)a3.foo()).print(); // => a3.foo().print();
    }
}
