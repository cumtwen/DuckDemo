package Modle;

public class RedheadDuck extends Duck {
	public RedheadDuck(){
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
