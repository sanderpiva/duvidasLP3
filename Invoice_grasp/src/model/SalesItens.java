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
		
		return product.getPrice().getValuesProducts()*this.itemQuantity;   
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
	
	@Override
	public String toString() {
		return "Itens vendidos [produto = " + product.getDescription() +
				", preco unitario = R$" + product.getPrice().getValuesProducts() + 
				", quantidade itens = " + this.itemQuantity +", subtotal = R$" +
				(product.getPrice().getValuesProducts()*this.itemQuantity)+"]";
	}
}
