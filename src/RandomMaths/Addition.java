package RandomMaths;

public class Addition {
	private int math = 5;
	
	public Addition(int math) {
		super();
		this.math = math;
	}

	public Addition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	//
	public int makeBigger() {
		math = math + 5;
		return math;
	}
	
	public int makeEvenBigger() {
		math = math + 10;
		return math;
	}
	
	
}
