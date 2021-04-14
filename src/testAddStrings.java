import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTesting junit = new jUnitTesting();
		String result = junit.addStrings("new", "Test");
		assertEquals ("newTest",result);
	}

}
