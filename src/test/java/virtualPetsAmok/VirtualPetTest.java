package virtualPetsAmok;

import org.junit.Test;

import virtualPetsAmok.VirtualPet;

import static org.junit.Assert.assertEquals;

public class VirtualPetTest {

	@Test
	public void shouldCreateVirtualPetName() {
		// arrange
		VirtualPet underTest = new VirtualPet("name", "description", 10, 10);
		// act
		String result = underTest.getName();
		// assert
		assertEquals("name", result);
	}

	@Test
	public void shouldCreateVirtualPetDesc() {
		// arrange
		VirtualPet underTest = new VirtualPet("name", "description", 10, 10);
		// act
		String result = underTest.getDescription();
		assertEquals("description", result);
	}

	// INT should have hunger thirst happiness

	@Test
	public void shouldGetHealthLevel() {
		VirtualPet underTest = new VirtualPet("", "", 10, 0);
		int result = underTest.getHealth();
		assertEquals(10, result);
	}

	@Test
	public void shouldHaveBoredomLevel() {
		VirtualPet underTest = new VirtualPet("", "", 0, 10);
		int result = underTest.getHappiness();
		assertEquals(10, result);
	}

	@Test
	public void shouldTimeTick() {
		VirtualPet underTest = new VirtualPet("", "", 0, 0);
		underTest.tick();
		int result = underTest.getTick();
		assertEquals(1, result);

	}
}
