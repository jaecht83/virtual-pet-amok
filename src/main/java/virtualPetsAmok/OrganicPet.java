package virtualPetsAmok;

public class OrganicPet extends VirtualPet {
	private int hunger;
	private int thirst;
	private int waste;

	public OrganicPet(String name, String description, int health, int happiness, int hunger, int thirst, int waste) {
		super(name, description, health, happiness);
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
	}

	public void feed() {
		hunger -= 5;
	}

	public int getHunger() {
		return hunger;
	}

	public void drink() {
		thirst -= 5;

	}

	public int getThirst() {
		return thirst;
	}

	public void poop() {
		waste -= 5;
	}

	public int getWaste() {
		return waste;
	}

}
