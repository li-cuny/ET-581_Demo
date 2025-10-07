//Test class to create objects and call the methods
class Test{
    public static void main(String args[]){
        Bank x = new Bank();
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        
        System.out.println("Bank Rate of Interest: "+x.getRateOfInterest());
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
        
        //System.exit(1);
        Bank b = new SBI();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());

        
        Bank [] c = new Bank[3];
        c[0] = new SBI();
        c[1] = new ICICI();
        c[2] = new AXIS();
        
        for(int j=0;j<3;j++){
            System.out.println("Rate of Interest: "+c[j].getRateOfInterest());
        }
    }
}