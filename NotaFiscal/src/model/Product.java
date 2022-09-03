package model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	
	private String description;
	private double unityPrice;
	private List<SalesItens> listSI = new ArrayList<SalesItens>();
	
	public Product(String d, double up) {
		
		description = d;
		this.unityPrice = up;
	}
	
	public double getPrice() {
		
		return this.unityPrice;
		
	}
	
	public String getDescription() {
		
		return description;
	}
	
	public List<SalesItens> getSalesItens(){
		
		return listSI;
	}
	
	
}
