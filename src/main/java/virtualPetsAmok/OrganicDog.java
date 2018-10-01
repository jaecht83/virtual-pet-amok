package virtualPetsAmok;

public class OrganicDog extends OrganicPet {

	private int cageWaste = 3;
	private int wasteStuff = 0;

	public OrganicDog(String name, String description, int health, int happiness, int hunger, int thirst, int waste,
			int cageWaste) {
		super(name, description, health, happiness, hunger, thirst, waste);
		this.cageWaste = cageWaste;

	}

	public int cleanCage() {
		this.happiness += 5;
		return cageWaste = 0;
	}

	public void walk() {
		happiness += 15;
		wasteStuff -= 3;

	}

	public int getHappiness() {
		return happiness;
	}

	public int getWasteProductionStuff() {
		return wasteStuff;

	}

	public void dogTicktime() {
		cageWaste++;
		wasteStuff++;
	}

	public int getCageStatus() {
		return cageWaste;
	}

}
