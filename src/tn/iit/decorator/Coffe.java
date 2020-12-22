package tn.iit.decorator;

public class Coffe extends Beverage {
		
	public Coffe()
	{
		this.description="Cofee";	
	}

	@Override
	public double cost() {
		
		return 1000;
	}	
}
