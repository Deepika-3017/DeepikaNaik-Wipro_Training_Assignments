class Customer {
    private int id;
    private String name;
    private int discount;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer[id=" + id + ",name=" + name + ",discount=" + discount + "]";
    }
}

class Invoice1 {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice1(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getAmountAfterDiscount() {
        return amount * (1 - customer.getDiscount() / 100.0);
    }

    @Override
    public String toString() {
        return "Invoice[id=" + id + "," + customer.toString() + ",amount=" + amount + "]";
    }
}


public class CustomerClass {

	public static void main(String[] args) {
		
		        Customer customer = new Customer(1, "John Doe", 10);
		        Invoice1 invoice = new Invoice1(1001, customer, 200.00);
		        System.out.println(invoice.toString());
		        System.out.println("Amount after discount: " + invoice.getAmountAfterDiscount());
		    }
		}
