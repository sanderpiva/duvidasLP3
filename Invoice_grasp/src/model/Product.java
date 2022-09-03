package model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	
	private String description;
	private ValuesProducts unityPrice;
	private List<SalesItens> listSI = new ArrayList<SalesItens>();
	
	public Product(String d, ValuesProducts up) {
		
		description = d;
		unityPrice = up;
	}
	
	
	public ValuesProducts getPrice() {
		
		return unityPrice;
		
	}
	
	public String getDescription() {
		
		return description;
	}
	
	public List<SalesItens> getSalesItens(){
		
		return listSI;
	}		
}
