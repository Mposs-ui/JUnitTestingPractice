import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import RandomMaths.Subtraction;
import RandomMaths.Addition;

public class SubtractionTest {
	int little = 5;
	int big = 10;
	int solution = 15;
	
	Addition add = new Addition(big);
	Subtraction minus = new Subtraction(little, add);
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void subtractTest() {
		assertEquals(solution, minus.makeSmaller());
	}

}
