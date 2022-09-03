package model;

import java.util.ArrayList;
import java.util.List;

public class Sales{

	private List<SalesItens> listSalesItens = new ArrayList<SalesItens>();
	private double total;
	private String date;
	private String hour;

	public Sales(String date, String hour) {

		this.date=date;
		this.hour=hour;
	}


	public void addSaleItem(SalesItens s) {

		listSalesItens.add(s);

	}

	public List<SalesItens> getDataNF() {

	
		return listSalesItens;
	
	}

	public double Total() {

		for(SalesItens sAux: getDataNF()) {
			total+= sAux.getSubTotal();

		}

		return total;
	}

	public String getDate() {
		return date;
	}
	
	public String getHour() {
		return hour;
	}
}
