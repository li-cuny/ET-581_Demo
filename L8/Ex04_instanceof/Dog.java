class Dog extends Animal{//Dog inherits Animal

     public static void main(String args[]){
         Dog d=new Dog();
         System.out.println(d instanceof Animal);//true
         System.out.println(d instanceof Dog);//true
         Animal a = new Animal();
         System.out.println(a instanceof Animal);//true
         System.out.println(a instanceof Dog);//false
         Dog b = null;
         System.out.println(b instanceof Dog);//false 

         a = new Dog();
         System.out.println(a instanceof Animal);//true
         System.out.println(a instanceof Dog);//false
     }
}
