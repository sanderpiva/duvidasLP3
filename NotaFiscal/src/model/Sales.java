package model;

import java.util.ArrayList;
import java.util.List;

public class Sales{

	private List<SalesItens> listSalesItens = new ArrayList<SalesItens>();
	
	public void addSales(SalesItens s) {

		listSalesItens.add(s);

	}


	public List<SalesItens> getDataNF() {


		return listSalesItens;
	}

}
