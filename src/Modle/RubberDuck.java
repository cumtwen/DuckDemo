package Modle;

public class RubberDuck extends Duck {
	public RubberDuck(){
		quackBehavior = new Squeak();
	    flyBehavior = new FlyNoWay();

	}

	public void display(){
		System.out.println("����Ѽ");
	}
	public void swim(){
		System.out.println("����Ѽ");
	}
}
