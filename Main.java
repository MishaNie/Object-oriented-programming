package gamekill;

public class Main {

	public static void main(String[] args) {
		Player1 player = new Player1("Misha","Gun",100);
		Player2 player2 = new Player2(100,true);
		

		player.damageByGun1();
		player2.damageByGun2();
		
		
		
	}

}
