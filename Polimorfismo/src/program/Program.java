package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	List<Product> list = new ArrayList<>();
	System.out.print ("Enter the number of products:");
	int n = sc.nextInt();
	
	for (int i=1; i<=n;i++) {
		System.out.println("Product #"+i+ " data:" );
		System.out.print("Common, used or imported (c/u/i)?");
		char c = sc.next().charAt(0);
		System.out.println("Name:");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Price:");
		Double price = sc.nextDouble();
		if (c == 'i') {
			System.out.println("Customs fee:");
			Double customsFee = sc.nextDouble();
			ImportedProduct p = new ImportedProduct(name, price, customsFee);
			p.totalPrice();
			list.add(p);
		}
		else
			if(c == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY):");
				sc.nextLine();
				String manufacturedDate = sc.nextLine();
				list.add(new UsedProduct(name, price, manufacturedDate));
			}
			else {
				list.add(new Product(name, price));
			}
	

		}
	System.out.println();
	System.out.println("PRICE TAGS:");
	for(Product p: list) {
		System.out.println(p.getName()+ " " + p.priceTag() + " ");
	}
	sc.close();
	
	}
}
