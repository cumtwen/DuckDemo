package Modle;

public class MallardDuck extends Duck {
	
	public MallardDuck(){
		quackBehavior = new Quack();
	    flyBehavior = new FlyWithWings();

	}

	public void display(){
		System.out.println("��ͷѼ");
	}
	public void swim(){
		System.out.println("��ͷѼ");
	}
}
