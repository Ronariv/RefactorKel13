
public class Main {

	public static void main(String[] args) {
		System.out.println("What type of weapon is the warrior using?");

        Warrior warrior1 = new Warrior("Swordsman", new Weapon("Sword", "Longsword"));

        warrior1.weapontype();
	}

}
