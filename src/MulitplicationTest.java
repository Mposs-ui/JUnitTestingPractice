import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import RandomMaths.Multiplication;

public class MulitplicationTest {
	int solution;
	int baseNumber = 25;
	
	Multiplication multi = new Multiplication(baseNumber);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void multipliTest() {
		solution = baseNumber * baseNumber;
		assertEquals(solution, multi.exponentialGrowth());
	}

}
