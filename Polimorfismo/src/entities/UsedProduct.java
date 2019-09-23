package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private String manufacturedDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, String manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	public String getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(String manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	@Override
	public String priceTag() {
		//SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		//Date d1 = sdf1.parse(manufacturedDate);
		return "$ " + price + " (Manufacture date: $ " + manufacturedDate + ")";
	}
	
}
