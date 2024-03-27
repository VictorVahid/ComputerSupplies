public class Invoice {
	public int identification;
	public String description;
	public int amount;
	public double uniteprice;
	public double bill;

	public Invoice() {
		this.identification = 0;
		this.description = "";
		this.uniteprice = 0;
		this.bill = 0.0;
	}


	public double getInvoiceAmount() {
		if (this.uniteprice <=0 && this.amount <=0){
			throw new RuntimeException("Digite um número maior que 0");
		}
		this.bill = this.uniteprice * this.amount;
		return this.bill;
	}

	public String toString() {
		return "Invoice ID: " + this.identification + "\nDescription: " + this.description +
						"\nAmout: " + this.amount + "\nUnite Price: " + this.uniteprice;
	}


}
