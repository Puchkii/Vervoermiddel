import java.util .*;	//ALVAST IMPORT GEDAAN VOOR LATER

public class Wegenbelasting {

	private double TaxAmount;
	private int  Weight;

	public Wegenbelasting(double tax, int weight) {
		TaxAmount = tax;
		Weight = weight;
	}

	public double getTaxAmount() {
		return TaxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		TaxAmount = taxAmount;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	/**
	public static void main(String[] args) {

		if for (int Weight = 1351; Weight < 1450; Weight++)
			else for (int Weight = 1051; Weight < 1150; Weight++)

			else for (int Weight = 1151; Weight < 1250; Weight++)

			else System.out.println("Error");


	}
  */
}