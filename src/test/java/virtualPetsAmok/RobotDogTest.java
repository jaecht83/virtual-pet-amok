package virtualPetsAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class RobotDogTest {

	@Test
	public void shouldPlusOil() {
		RobotDog underTest = new RobotDog("", "", 0, 0, 0, true);
		underTest.maintainRobot();
		int result = underTest.getOilLevel();
		assertEquals(200, result);

	}

	@Test
	public void isADoggieOrNot() {
		RobotDog underTest = new RobotDog("", "", 0, 0, 0, true);
		boolean result = underTest.animalTypeIsDog;
		assertEquals(true, result);
	}

	@Test
	public void robotTicktime() {
		RobotDog underTest = new RobotDog("", "", 0, 0, 0, true);
		underTest.maintainRobot();
		underTest.robotTicktime();
	}

}
