package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;


public class AssertionsTest {

	@Test
	void shouldBeTrue () {
		Assertions.assertTrue(true);
	}
	
	@Test
	void shouldBeTrueWithLembda () {
		Assertions.assertEquals(false, 3 == 2, () -> "3 not equal to 2 !");
	}
}