package business;

public class BusinessCalculations {

	private int nbr;
	private String countA;
	
	public BusinessCalculations() {
		super();
	}

	public int getNbr() {
		return nbr;
	}

	public void setNbr(int nbr) {
		this.nbr = nbr;
	}

	public String getCountA() {
		return countA;
	}

	public void setCountA(String countA) {
		this.countA = countA;
	}

	@Override
	public String toString() {
		return "BusinessCalculations [nbr=" + nbr + ", countA=" + countA + "]";
	}
	
		
}
