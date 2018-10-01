package virtualPetsAmok;

import virtualPetsAmok.VirtualPet;

public class RobotDog extends VirtualPet {

	private int oilLevel;
	public boolean animalTypeIsDog;

	public RobotDog(String name, String description, int health, int happiness, int oilLevel,
			boolean animalTypeIsDog) {
		super(name, description, health, happiness);
		this.oilLevel = oilLevel;
		this.animalTypeIsDog = animalTypeIsDog;
	}

	public void maintainRobot() {
		oilLevel = 200;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	public void addOil() {
		oilLevel += 3;
	}

	public void robotTicktime() {
		oilLevel -= 4;
	}

	public void walk() {
		if (animalTypeIsDog = true) {
			happiness += 10;
		} else if (animalTypeIsDog = false) {
			happiness += 0;
		}
	}

}
