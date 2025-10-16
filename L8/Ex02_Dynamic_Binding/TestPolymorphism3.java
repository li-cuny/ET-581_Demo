class TestPolymorphism3{
    public static void main(String[] args){
        Animal a;
        a=new Dog();
        a.eat();
        a=new Cat();
        a.eat();
        a=new Lion();
        a.eat();  
    }
}
