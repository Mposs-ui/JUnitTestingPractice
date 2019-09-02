import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import RandomMaths.Multiplication;

public class MulitplicationTest {
	int solution;
	int baseNumber = 25;
	boolean bigIfTrue = false;
	Multiplication multi = new Multiplication(baseNumber);
	
	@Before
	public void setUp() throws Exception {
		if (solution == 0) {
			bigIfTrue = true;
		}
	}

	//ensuring that the value isn't null
	@Test
	public void isNotNullTest() {
		assertNotNull(multi.exponentialGrowth());
	}
	
	//verifying that the variable solution is actually zero before inputting values into it
	@Test
	public void solutionIsZero() {
		assertTrue(bigIfTrue);
	}
	
	@Test
	public void multipliTest() {
		solution = baseNumber * baseNumber;
		assertEquals(solution, multi.exponentialGrowth());
	}

}
