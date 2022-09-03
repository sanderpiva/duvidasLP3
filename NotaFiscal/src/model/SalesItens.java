package model;

public class SalesItens {

	private double itemQuantity;
	private Sales sale;
	private Product product;


	public SalesItens(double itemQuantity, Product p) {

		this.itemQuantity = itemQuantity;
		product=p;
	}


	public double getSubTotal() {
		
		return product.getPrice()*this.itemQuantity;
	}


	public double getItemQuantity() {
		return itemQuantity;
	}
	

	public Sales getSales() {

		return sale;

	}

	public Product getProduct() {

		return product;

	}

}
