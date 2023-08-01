package junit;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;


public class DisabledTest {
	
	@Test
	@Disabled("Implementation is pending")
	void skippedTest () {
		fail("Feature is not implemented yet");
	}
	
	@Test
	void simpleTest () {
		assertTrue(true);
	}

}