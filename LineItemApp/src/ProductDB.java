public class ProductDB {
	public static Product getProduct(String productCode) {
		Product p = new Product();
		p.setCode(productCode);
		if (productCode.equalsIgnoreCase("java")) {
			p.setDescription("An good programming language!");
			p.setPrice(29.8);
			p.setIsTaxable(true);
		} else if (productCode.equalsIgnoreCase("html")) {
			p.setDescription("HTML is a language for website!");
			p.setPrice(100.00);
			p.setIsTaxable(false);
		} else if (productCode.equalsIgnoreCase("javascript")) {
			p.setDescription("JavaScript is a scripting language!");
			p.setPrice(50.00);
			p.setIsTaxable(true);
		} else {
			p.setDescription("Unknown");
		}
		return p;
	}
}