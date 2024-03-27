import java.util.Locale;
import java.util.Scanner;

public class TestInvoice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Invoice sup = new Invoice();


		System.out.println("Enter item id: ");
		sup.identification = sc.nextInt();
		System.out.println("Item Description:");
		sup.description = sc.next();
		System.out.println("Item Quantity: ");
		sup.amount = sc.nextInt();
		System.out.println("Price Item: ");
		sup.uniteprice = sc.nextDouble();

		System.out.println(sup);
		System.out.printf("\nInvoice: %.2f", sup.getInvoiceAmount());

		sc.close();
	}
}
