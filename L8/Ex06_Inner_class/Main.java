public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass1 myInner1 = myOuter.new InnerClass1();
    System.out.println(myInner1.y +" "+ myOuter.x);

    // If you try to access a private inner
    // class from an outside class, an error occurs
    // OuterClass.InnerClass myInner2 = myOuter.new InnerClass2();
    // System.out.println(myInner2.y + myOuter.x);

    // just like static attributes and methods,
    // a static inner class does not have access to members of the outer class.
    OuterClass.InnerClass3 myInner3 = new OuterClass.InnerClass3();
    System.out.println(myInner3.y);
    //System.out.println(myInner3.x);

    OuterClass.InnerClass4 myInner4 = myOuter.new InnerClass4();
    System.out.println(myInner4.myInnerMethod());
  }
}
