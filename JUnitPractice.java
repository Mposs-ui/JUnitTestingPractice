import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import RandomMaths.Addition;
public class AdditionTest {
	int solution = 15;
	
	Addition add = new Addition(solution);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void addTest() {
		solution = solution + 5;
		assertEquals(solution, add.makeBigger());
	}

	@Test
	public void addMoreTest() {
		solution = solution + 10;
		assertEquals(solution, add.makeEvenBigger());
	}
}
