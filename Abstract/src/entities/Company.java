package entities;

public class Company extends TaxPayer {
	private int employee;
	
	public Company() {
		super();
	}

	public Company(String name, Double income, int employee) {
		super(name, income);
		employee = employee;
	}

	@Override
	public Double tax() {
		if(employee >10 )
		return income *0.14;
		else
			return income *0.16;
	}
	
	

}
