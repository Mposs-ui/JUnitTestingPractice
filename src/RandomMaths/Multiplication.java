package RandomMaths;

public class Multiplication {
	private int variable;

	public Multiplication(int variable) {
		super();
		this.variable = variable;
	}

	public Multiplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getVariable() {
		return variable;
	}

	public void setVariable(int variable) {
		this.variable = variable;
	}
	
	public int exponentialGrowth() {
		variable = variable * variable;
		return variable;
	}

}
