public class Invoice {
	public int identification;
	public String description;
	public int amount;
	public double uniteprice;

	public String toString() {
		return "Invoice ID: " + this.identification + "\nDescription: " + this.description +
						"\nAmout: " + this.amount + "\nUnite Price: " + this.uniteprice;
	}
}
