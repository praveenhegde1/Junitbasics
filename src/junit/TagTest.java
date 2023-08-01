package junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;



@IncludeTags({"critical"})
public class TagTest {

	@Tag("critical")
	@Test
	void basicFunctionalityTestcase () {
		assertTrue(true);
	}
	
	@Tag("normal")
	@Test
	void advanceFunctionalityTestcase () {
		assertTrue(true);
	}
}