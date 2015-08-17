import java.text.NumberFormat;

public class Product {

	private String code;
	private String description;
	private double price;
	private boolean isTaxable;

	public Product() {
		code = "";
		description = "";
		price = 0.0;
		isTaxable = true;
	}

	public Product(String code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;
		this.isTaxable = true;
	}

	// ----code
	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	// ----description
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	// ----price
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	// ----isTaxable
	public void setIsTaxable(boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	public boolean getIsTaxable() {
		return isTaxable;
	}

	public String getFormattedPrice() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}

	public double calculateTax(double price) {
		return price = price * 0.09;
	}

}