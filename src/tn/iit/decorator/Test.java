package tn.iit.decorator;

public class Test {

	public static void main(String[] args) {
		
		
		
		/*Beverage b = new Milk(new Whip(new Coffe()));
	        System.out.println(b.getDescription());
	        System.out.println(b.cost());
        b =new Pine(new Milk(new Whip(new Coffe())));
	        System.out.println(b.getDescription());
	        System.out.println(b.cost());*/
		Beverage b = new Coffe();
		b= new Milk(b);
		System.out.println(b.getDescription());
		System.out.println(b.cost());
		b= new Milk(b);
		System.out.println(b.getDescription());
		System.out.println(b.cost());

	}

}
