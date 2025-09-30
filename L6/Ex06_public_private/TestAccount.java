//Creating a test class to deposit and withdraw amount
class TestAccount{
    public static void main(String[] args){
        Account a1=new Account();
        a1.insert(832345,"Jack",1000);
        a1.display();
        //System.out.println(a1.acc_no);
        System.out.println(a1.name);
        System.out.println(a1.amount);
        //a1.acc_no = 123456;
        a1.name = "David";
        a1.amount = 1000000;
        System.out.println(a1.name);
        System.out.println(a1.amount);

        //System.exit(1);
        //a1.checkBalance();
        a1.deposit(40000);
        a1.display();
        a1.withdraw(15000);
        a1.display();
    }
}
