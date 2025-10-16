public class Emp {
    int id;
    String name;
    Address address; //aggregation

    public Emp(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1=new Address("NYC","NY","US");
        Address address2=new Address("Paris","unknown","France");

        Emp e=new Emp(111,"Jack",address1);
        Emp e2=new Emp(112,"Fabian",address2);

        e.display();
        e2.display();
        address1.setAddress("LA","CA","US");
        e.display();
        e.address = address2;
        e.display();
    }
}
