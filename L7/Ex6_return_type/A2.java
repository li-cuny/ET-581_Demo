// A2 is the child class of A1
class A2 extends A1
{
    @Override
    A1 foo()
    {
        return this;
    }

    void print()
    {
        System.out.println("Inside the class A2");
    }
}  
