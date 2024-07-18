class Invoice{

	private int id;
    private String description;
    private int quantity;
    private double unitPrice;

    public Invoice(int id, String description, int quantity, double unitPrice) {
		super();
		this.id = id;
		this.description = description;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double calculateTotalPrice() {
        return quantity * unitPrice;
    }
}

public class InvoiceItem {
	 public static void main(String[] args) {

		 Invoice[] items = new Invoice[3];

	        items[0] = new Invoice(1, "Item A", 2, 15.99);
	        items[1] = new Invoice(2, "Item B", 3, 24.99);
	        items[2] = new Invoice(3, "Item C", 1, 9.99);

	        // Print the details of each InvoiceItem
	        for (Invoice item : items) {
	            System.out.println("ID: " + item.getId());
	            System.out.println("Description: " + item.getDescription());
	            System.out.println("Quantity: " + item.getQuantity());
	            System.out.println("Unit Price: " + item.getUnitPrice());
	            System.out.println("Total Price: " + item.calculateTotalPrice());
	            System.out.println();
	        }   
    }

}