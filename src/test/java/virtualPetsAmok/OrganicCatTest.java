package virtualPetsAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import virtualPetsAmok.OrganicCat;

public class OrganicCatTest {

	@Test
	public void shouldCleanLitterbox() {
		OrganicCat underTest = new OrganicCat("", "", 0, 0, 0, 0, 0, 0);
		underTest.cleanLitterbox();
		int result = underTest.cleanLitterbox();
		assertThat(result, is(0));

	}

	@Test
	public void shouldTicktimeCat() {
		OrganicCat underTest = new OrganicCat("", "", 0, 0, 0, 0, 0, 0);
		underTest.catTicktime();
		int result = underTest.catTicktime();
		assertThat(result, is(1));
	}
}
