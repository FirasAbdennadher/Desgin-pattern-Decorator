package tn.iit.decorator;

public abstract class Beverage {
	
	protected String description;
	protected float cost;
	
	
	public String getDescription()
	{
		return this.description;
	}
	 public abstract double cost();
	
}
