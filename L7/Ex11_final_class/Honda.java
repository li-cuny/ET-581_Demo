class Honda extends Bike{ // error: can not extend final class
    void run(){System.out.println("running safely with 100kmph");}

    public static void main(String args[]){
        Honda honda= new Honda();
        honda.run();
    }
}
// final var => not allow to change
// final method => not allow to override
// final class => not allow to extend
