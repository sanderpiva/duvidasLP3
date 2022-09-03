package view;


import model.Product;
import model.Sales;
import model.SalesItens;

public class Main {


	public static void main(String[]args) {
		
		double sum=0;
		
		Product p = new Product("arroz", 28);
		
		SalesItens si = new SalesItens(10, p);
		
		Product p2 = new Product("feijao", 8.5);
				
		SalesItens si2 = new SalesItens(2, p2);
		
		Sales sale = new Sales();
		sale.addSales(si);
		sale.addSales(si2);
		sale.getDataNF();
		System.out.println("Lista compras: Cumpo Fiscal\n");
		for(SalesItens s: sale.getDataNF()) {

			System.out.print("-Produto "+s.getProduct().getDescription());
			System.out.print("-Preco unit "+s.getProduct().getPrice());
			System.out.print("-Qtd de itens "+s.getItemQuantity());
			System.out.print("-Subtotal "+s.getSubTotal()+"\n");
			sum+=s.getSubTotal();
		}
		
		System.out.println("-Total R$"+sum);
	}

}
