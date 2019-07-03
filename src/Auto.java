public class Auto extends Vervoermiddel {

	//declareren

	private int weight;
	private double tax;

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWheelCount() {
		return 4;
	}
}