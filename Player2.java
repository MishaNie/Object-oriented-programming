package gamekill;

public class Player2 {
 
	private int health;
	private boolean armour;
	
	
	public Player2(int health, boolean armour) {
		this.health = health;
		this.armour = armour;
	}
	
	
	public void damageByGun1() {
	if(armour) {
		this.health -= 20;
		if(this.health <= 0) 
			this.health = 0;
		System.out.println("Armour is on. Got hit by gun 1. Health reduced by 20 " + "new health is : " + this.health);
	}if(!armour) {
		this.health -= 30;
		if(this.health <= 0) 
			this.health = 0;
		System.out.println("Armour is on. Got hit by gun 1. Health reduced by 30 " + "new health is : " + this.health);
	}
	}
	 
	public void damageByGun2() {
		if(armour) {
			this.health -= 60;
			if(this.health <= 0) 
				this.health = 0;
			System.out.println("Armour is on. Got hit by gun 2. Health reduced by 60 " + "new health is : " + this.health);
		}if(!armour) {
			this.health -= 70;
			if(this.health <= 0) 
				this.health = 0;
			System.out.println("Armour is on. Got hit by gun 2. Health reduced by 70 " + "new health is : " + this.health);
		}
	}
	
}
