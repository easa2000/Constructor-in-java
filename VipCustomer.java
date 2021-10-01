public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(String name,double creditLimit,String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"mahudoomn@gmail.com");
    }
    public VipCustomer() {
        this("Mahudoom",100_000,"abc@gmail.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
    }
}
