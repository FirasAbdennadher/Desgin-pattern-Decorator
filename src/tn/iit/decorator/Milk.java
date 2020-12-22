package tn.iit.decorator;


public class Milk extends CondimentDecorator {
	
	public Milk(Beverage beverage) {
		
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", milk";
	}

	@Override
	public double cost() {
		return 300+beverage.cost();
		
	}
}
