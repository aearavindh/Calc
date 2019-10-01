import static org.junit.Assert.*;

import org.junit.Test;

public class DivTest {

	@Test
	public void test() {
		int result = Calc.div(10,5);
		assertEquals(2, result);
	}

}
