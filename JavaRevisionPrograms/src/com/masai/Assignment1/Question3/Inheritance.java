package com.masai.Assignment1.Question3;
class Actor{
	public void act() {
		System.out.println("Acting");
	}
}
class Hero extends Actor{
	public void fight() {
		System.out.println("Fignting");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Actor a=new Actor();
		a.act();
		Hero h=new Hero();
		h.act();
		h.fight();
		
		Actor ac=new Hero();
	    Hero hr=(Hero)new Actor();
	    hr.act();
	    hr.fight();

	}

}
