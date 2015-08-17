import java.util.Scanner;

public class LineItemApp {
	public static void main(String[] args) {
		double untaxableTotal = 0, taxableTotal = 0, taxTotal = 0;
		System.out.println("Welcome to the Line Item Calculator");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String productCode = Validator
					.getString(sc, "Enter product code: ");
			int quanlity = Validator.getInt(sc, "Enter quanlity: ", 0, 10);
			Product product = ProductDB.getProduct(productCode);
			LineItem lineItem = new LineItem();
			lineItem.setProduct(product);
			lineItem.setQuanlity(quanlity);
			System.out.println();
			System.out.println("LINE ITEM");
			System.out.println("Code: " + product.getCode());
			System.out.println("Description: " + product.getDescription());
			System.out.println("Price: " + product.getFormattedPrice());
			System.out.println("Quanlity: " + lineItem.getQuanlity());
			System.out.println("Total: " + lineItem.getFormattedTotal() + "\n");
			if (product.getIsTaxable()) {
				taxableTotal += lineItem.getTotal();
				taxTotal += product.calculateTax(lineItem.getTotal());
			} else {
				untaxableTotal += lineItem.getTotal();

			}
			choice = Validator.getString(sc, "Continue?(y/n): ");
			System.out.println();
		}
		System.out.println("Taxable total: " + taxableTotal);
		System.out.println("Untaxable total: " + untaxableTotal);

		// double priceNew=book.calculatePrice(book.getPrice());
		System.out.println("Tax: " + taxTotal);
		System.out.println("Grand total: "
				+ (taxableTotal + untaxableTotal + taxTotal));
	}
}