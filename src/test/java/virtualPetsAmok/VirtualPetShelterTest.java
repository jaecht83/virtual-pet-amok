package virtualPetsAmok;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.not;

public class VirtualPetShelterTest {

	@Test
	public void shouldAddPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet Baker = new VirtualPet("", "", 0, 0);
		underTest.addPet(Baker);
		Assert.assertThat(underTest.pets.values(), contains(Baker));
	}

	@Test
	public void shouldRemovePet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet Baker = new VirtualPet("", "", 0, 0);
		String name = Baker.getName();
		underTest.addPet(Baker);
		underTest.removePet(name);
		Assert.assertThat(underTest.pets.values(), not(Baker));
	}

	@Test
	public void changeOrganicPetFeed() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicDog Baker = new OrganicDog("", "OrganicCat", 20, 100, 0, 20, 0, 0);
		underTest.addPet(Baker);
		underTest.feedOrganicPets();
		// not sure how to do the assertEquals with the changing names
	}

	@Test
	public void oilRobotPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		RobotDog Baker = new RobotDog("", "", 100, 100, 60, true);
		underTest.addPet(Baker);
		underTest.oilRobots();
		Assert.assertEquals(200, (Baker).getOilLevel());
	}

	@Test
	public void shouldWalkDoggies() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicDog Baker = new OrganicDog("", "", 20, 100, 100, 100, 0, 0);
		underTest.addPet(Baker);
		underTest.walkDoggies();
		Assert.assertEquals(100, (Baker).getHappiness());
	}

	@Test
	public void shouldTickRobot() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		RobotDog Baker = new RobotDog("", "", 0, 0, 0, true);
		underTest.tickPets();
	}

	@Test
	public void shouldTrackStatus() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet Baker = new RobotDog("", "", 0, 0, 0, false);
		underTest.trackStatus();
	}
}