package model;

public enum ValuesProducts {
	
	ARROZ(28),
	FEIJAO(8.5);
	
	private final double valueProduct;
	
	private ValuesProducts(double vp) {
		
		valueProduct = vp;
	}
	
	public double getValuesProducts() {
		
		return valueProduct;
	}
}
