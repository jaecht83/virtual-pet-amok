package virtualPetsAmok;

import org.junit.Assert;
import org.junit.Test;

public class OrganicDogTest {

	@Test
	public void shouldCleanCage() {
		OrganicDog underTest = new OrganicDog("", "", 0, 0, 0, 0, 0, 0);
		underTest.cleanCage();
		int result = underTest.cleanCage();
		Assert.assertEquals(0, result);
	}

	@Test
	public void shouldWalkOrganicDog() {
		OrganicDog underTest = new OrganicDog("", "", 0, 0, 0, 0, 0, 0);
		underTest.walk();
		int result = ((OrganicDog) underTest).getHappiness();
		Assert.assertEquals(15, result);
	}

	@Test
	public void shouldTicktimeDog() {
		OrganicDog underTest = new OrganicDog("", "", 0, 0, 0, 0, 0, 0);
		underTest.dogTicktime();
		int result = ((OrganicDog) underTest).getCageStatus();
		Assert.assertEquals(1, result);
	}
}
