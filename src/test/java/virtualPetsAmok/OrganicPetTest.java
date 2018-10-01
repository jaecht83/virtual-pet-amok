package virtualPetsAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import virtualPetsAmok.OrganicPet;

public class OrganicPetTest {

	@Test
	public void shouldFeed() {
		OrganicPet underTest = new OrganicPet("", "", 0, 0, 5, 0, 0);
		underTest.feed();
		int result = underTest.getHunger();
		assertThat(result, is(0));
	}

	@Test
	public void shouldThirst() {
		OrganicPet underTest = new OrganicPet("", "", 0, 0, 0, 5, 0);
		underTest.drink();
		int result = underTest.getThirst();
		assertThat(result, is(0));
	}

	@Test
	public void shouldWaste() {
		OrganicPet underTest = new OrganicPet("", "", 0, 0, 0, 0, 5);
		underTest.poop();
		int result = underTest.getWaste();
		assertThat(result, is(0));
	}
}
