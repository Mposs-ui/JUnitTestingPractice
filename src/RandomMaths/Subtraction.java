package RandomMaths;

public class Subtraction {
	private int littleNumber = 5;
	private int bigNumber = 10;
	private int middleNumber;
	
	//I really just wanted to make my code a bit more complex for fun,
	//so I used my Addition class to spice things up
	Addition add = new Addition(bigNumber);

	public Subtraction(int littleNumber, Addition add) {
		super();
		this.littleNumber = littleNumber;
		this.add = add;
	}

	public int getLittleNumber() {
		return littleNumber;
	}

	public void setLittleNumber(int littleNumber) {
		this.littleNumber = littleNumber;
	}

	public int getBigNumber() {
		return bigNumber;
	}

	public void setBigNumber(int bigNumber) {
		this.bigNumber = bigNumber;
	}

	public int getMiddleNumber() {
		return middleNumber;
	}

	public void setMiddleNumber(int middleNumber) {
		this.middleNumber = middleNumber;
	}
	
	public int makeSmaller() {
		middleNumber = add.makeEvenBigger() - littleNumber;
		return middleNumber;
	}
	
	
	
}
