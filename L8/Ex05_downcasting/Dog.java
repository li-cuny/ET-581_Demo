class Dog extends Animal {
  static void downcast(Animal a) {
    if(a instanceof Dog){
       Dog d=(Dog)a;//downcasting
       System.out.println("ok downcasting performed");
    }
    else {
      System.out.println("can not downcasting");
    }
  }
  static void method(Animal a) {
       Dog d=(Dog)a;//downcasting
       System.out.println("ok downcasting performed");
  }
  public static void main (String [] args) {
    Animal a=new Dog();
    Dog.downcast(a);
    Animal b=new Animal();
    Dog.downcast(b);

    Dog.method(a);
    Dog.method(b);
  }
}
