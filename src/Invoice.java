public class Invoice {
	public int identification;
	public String description;
	public int amount;
	public double uniteprice;

	public Invoice(int identification, String description, int amount, double uniteprice) {
		this.identification = identification;
		System.out.println(this.identification);
		this.description = description;
		System.out.println(this.description);
		this.amount = (amount > 0) ? amount : 0;
		System.out.println(this.amount);
		this.uniteprice = uniteprice > 0 ? uniteprice : 0.0;
		System.out.println(this.uniteprice);
	}

	public Invoice() {

	}

	public String toString() {
		return "Invoice ID: " + this.identification + "\nDescription: " + this.description +
						"\nAmout: " + this.amount + "\nUnite Price: " + this.uniteprice;
	}
}
