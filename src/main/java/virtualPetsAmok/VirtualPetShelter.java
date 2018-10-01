package virtualPetsAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void addPet(VirtualPet name) {
		pets.put(name.getName(), name);
	}

	public void removePet(String petToRemove) {
		pets.remove(petToRemove);
	}

	public void feedOrganicPets() {
		for (VirtualPet eachPet : pets.values()) {
			if (eachPet instanceof OrganicPet) {
				((OrganicPet) eachPet).getHunger();
			}

		}
	}

	public void waterOrganicPets() {
		for (VirtualPet eachPet : pets.values()) {
			if (eachPet instanceof OrganicPet)
				((OrganicPet) eachPet).getThirst();
		}
	}

	public void oilRobots() {
		for (VirtualPet eachPet : pets.values()) {
			if (eachPet instanceof RobotDog) {
				((RobotDog) eachPet).maintainRobot();
			}
		}
	}

	public void walkDoggies() {
		for (VirtualPet eachPet : pets.values()) {
			if (eachPet instanceof WalkablePets) {
				((RobotDog) eachPet).walk();
			}
		}
	}

	public void playWithOnePet(String name) {
		VirtualPet playingPet = pets.get(name);
		playingPet.play();
	}

	public void cleanAll() {
		for (VirtualPet eachPet : pets.values()) {
			if (eachPet instanceof OrganicPet) {
				((OrganicPet) eachPet).getWaste();
			}
		}
	}

	public Collection<VirtualPet> showPets() {
		Collection<VirtualPet> petCollection = pets.values();
		return petCollection;
	}

	public void tickPets() {
		for (VirtualPet eachPet : pets.values()) {
			if (eachPet instanceof RobotDog)
				((RobotDog) eachPet).robotTicktime();
			if (eachPet instanceof OrganicDog)
				((OrganicDog) eachPet).dogTicktime();
			if (eachPet instanceof OrganicCat)
				((OrganicCat) eachPet).catTicktime();

		}
	}

	public void trackStatus() {
		for (VirtualPet eachPet : pets.values()) {
			if (eachPet instanceof RobotDog)
				((RobotDog) eachPet).getOilLevel();
			if (eachPet instanceof OrganicDog)
				((OrganicDog) eachPet).getCageStatus();
			((OrganicDog) eachPet).getWasteProductionStuff();
			if (eachPet instanceof OrganicCat)
				((OrganicCat) eachPet).cleanLitterbox();
		}
	}

	public String dogStatus() {
		String dogStatus = "";

		for (VirtualPet eachPet : pets.values()) {
			if (eachPet instanceof OrganicDog) {
				dogStatus += eachPet.getName() + "\t " + "eachPet.getHealth()" + "\t " + eachPet.getHappiness() + "\n";
			}
		}
		return dogStatus;
	}

	public String catStatus() {
		String catStatus = "";

		for (VirtualPet eachPet : pets.values()) {
			if (eachPet instanceof OrganicCat) {
				catStatus += eachPet.getName() + "\t " + "eachPet.getHealth()" + "\t " + eachPet.getHappiness() + "\n";
			}
		}
		return catStatus;
	}

	public String robotStatus() {
		String robotStatus = "";

		for (VirtualPet eachPet : pets.values()) {
			if (eachPet instanceof RobotDog) {
				robotStatus += eachPet.getName() + "\t " + "eachPet.getHealth()" + "\t " + eachPet.getHappiness()
						+ "\n";
			}
		}
		return robotStatus;
	}

	public void play(String petName) {
		int happiness = 10;

	}

	public int getCleanLitterbox() {
		return -10;
	}

	public String optionNo5Display() {
		String optionNo5Display = "";
		for (Entry<String, VirtualPet> eachPet : pets.entrySet()) {
			optionNo5Display += "name: " + eachPet.getValue().getName() + "\t" + eachPet.getValue().getDescription()
					+ "\n";
		}
		return optionNo5Display;
	}

}