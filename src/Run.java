public class Run {
	public static void main(String[] args) {

		//auto object aangemaakt
		Auto auto = new Auto();

		//setters overgenomen van Vervoermiddel-klasse
		auto.setMerk("Ford");
		auto.setType("GT500");
		auto.setKleur("selenitgrau metallic");

		//setters van de Auto-klasse die specificeren
		auto.setWeight(1875);
		auto.setTax(580.00);
		System.out.println("De wegenbelasting bedraagt " + auto.getTax() + " euro per 3 maand");
//=====
		//wegenbelasting hoeveelheid
		Wegenbelasting WB = new Wegenbelasting(1901.50, 2000);
		System.out.println(WB.getTaxAmount());
	}
}