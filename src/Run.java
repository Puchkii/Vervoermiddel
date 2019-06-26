public class Run {
	public static void main(String[] args) {

		Auto auto = new Auto();

		//setters overgenomen van Vervoermiddel-klasse
		auto.setMerk("Ford");
		auto.setType("GT500");
		auto.setKleur("selenitgrau metallic");

		//setters van de Auto-klasse
		auto.setWeight(1875);
		auto.setTax(580.00);
		System.out.println("De wegenbelasting bedraagt " + auto.getTax() + " euro per maand");
	}
}