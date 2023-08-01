package junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;

@DisplayName("This is awesome test class")
public class NamedTest {

	@DisplayName("This is the lonely testcase")
	@Test
	void simpleTestCase () {
		assertTrue(true);
	}
	
}