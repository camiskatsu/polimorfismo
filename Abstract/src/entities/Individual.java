package entities;

public class Individual extends TaxPayer{
	private Double expenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double income, Double expenditures) {
		super(name, income);
		this.expenditures = expenditures;
	}
	
	@Override
	public Double tax() {
		if (income >20000.0)
		return income *0.25 - (expenditures*0.5);
		else
			return income *0.15- (expenditures*0.5);
	}
	

}
