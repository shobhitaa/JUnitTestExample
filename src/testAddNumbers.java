import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitTesting junit = new jUnitTesting();
		int result = junit.addNumbers(60, 20);
		assertEquals (80,result);
	}
}
