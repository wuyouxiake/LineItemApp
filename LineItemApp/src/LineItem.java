import java.text.NumberFormat;

public class LineItem {
	private Product product;
	private int quanlity;
	private double total;
	private boolean isTaxable;

	public LineItem() {
		this.product = new Product();
		this.quanlity = 0;
		this.total = 0;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public void setQuanlity(int quanlity) {
		this.quanlity = quanlity;
	}

	public int getQuanlity() {
		return quanlity;
	}

	public double getTotal() {
		this.calculateTotal();
		return total;
	}

	private void calculateTotal() {
		total = quanlity * product.getPrice();
	}

	public void setIsTaxable(boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	public boolean getIsTaxable() {
		return isTaxable;
	}

	public String getFormattedTotal() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(this.getTotal());
	}
}