class OuterClass {
  int x = 10;

  public class InnerClass1 {
    int y = 5;
  }
  private class InnerClass2 {
    int y = 10;
  }
  static class InnerClass3 {
    int y = 20;
  }
  class InnerClass4 { // default public
    public int myInnerMethod() {
      return x;
    }
  }
}
