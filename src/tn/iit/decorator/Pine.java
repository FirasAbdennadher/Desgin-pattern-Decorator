package tn.iit.decorator;

public class Pine extends CondimentDecorator {
	
	public Pine(Beverage beverage) {
		
		this.beverage=beverage;
		
	}

	@Override
	public String getDescription() {
		 return beverage.getDescription() + ", Pine";
	}

	@Override
	public double cost() {
		return 300+beverage.cost();
	}
}

