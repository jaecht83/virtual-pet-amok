package virtualPetsAmok;

public class OrganicCat extends OrganicPet {

	private int litterboxPoopVal = 0;

	public OrganicCat(String name, String description, int health, int happiness, int hunger, int thirst, int waste,
			int litterboxPoopVal) {
		super(name, description, health, happiness, hunger, thirst, waste);
		this.litterboxPoopVal = litterboxPoopVal;
	}

	public int cleanLitterbox() {
		return litterboxPoopVal = 0;
	}

	public void addPoop() {
		litterboxPoopVal += 33;
	}

	public int catTicktime() {
		return litterboxPoopVal++;
	}

}
