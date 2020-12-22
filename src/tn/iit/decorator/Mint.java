package tn.iit.decorator;

public class Mint extends CondimentDecorator {

	public Mint(Beverage beverage) {
		
		this.beverage=beverage;
		
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mint";
	}

	@Override
	public double cost() {
		
		return 250+beverage.cost();
	}
}
