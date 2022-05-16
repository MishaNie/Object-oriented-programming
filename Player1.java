package gamekill;

public class Player1 {
	
	private String name;
	private String weapon;
	private int health;
	
	// Getters and Setters
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getWeapon() {
		return weapon;
	}


	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}
//Constructor

	public Player1(String name, String weapon, int health) {
		this.name = name;
		this.weapon = weapon;
		if(health <0 || health >100) {
			this.health = 100;
			
		}else 
			this.health = health;
		
		}
	
	//Damage function
	public void damageByGun1() {
		this.health -= 30 ;
		if(this.health <= 0) {
			this.health = 0;
		}
		System.out.print("Got hit by gun 1. Health is reduced by 30 " + "New health is  " + this.health);
		
		if(this.health ==0) {
			System.out.println(getName() +"Player is dead");
		}
	}
	
	public void damageByGun2(){
		this.health -= 80 ;
		if(this.health <= 0) {
			this.health = 0;
		}
		System.out.print("Got hit by gun 2. Health is reduced by 80" + "New health is  " + this.health);
		
		if(this.health ==0) {
			System.out.println(getName() +"Player is dead");
		}
	}
	}

