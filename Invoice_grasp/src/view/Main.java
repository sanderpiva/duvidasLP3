package view;


import model.Product;
import model.Sales;
import model.SalesItens;
import model.ValuesProducts;

public class Main {


	public static void main(String[]args) {
		
		Product p = new Product("arroz", ValuesProducts.ARROZ);
		
		SalesItens si = new SalesItens(10, p);
		
		Product p2 = new Product("feijao", ValuesProducts.FEIJAO);
		
		SalesItens si2 = new SalesItens(2, p2);
		
		Sales sale = new Sales("22/08/2022", "10:30");
		sale.addSaleItem(si);
		sale.addSaleItem(si2);
		sale.getDataNF();
		System.out.println("Lista compras: Cupom Fiscal\n");
		System.out.println("Data: "+sale.getDate()+" Hora: "+sale.getHour());
			
		for(SalesItens s: sale.getDataNF()) {

			System.out.println(s);
		}
		
		System.out.println("-Total R$"+sale.Total());
	}

}
