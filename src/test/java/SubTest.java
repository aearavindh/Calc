import static org.junit.Assert.*;

import org.junit.Test;

public class SubTest {

	@Test
	public void test() {
		int result = Calc.sub(10,5);
		assertEquals(5, result);
	}

}
