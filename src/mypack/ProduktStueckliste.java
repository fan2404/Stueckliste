package mypack;

public class ProduktStueckliste extends Produkt {

	public ProduktStueckliste(String name, int anzahl) {
		super(name, anzahl);
	}

	@Override
	protected String getProdukt() {
		return "Stueckliste";
	}
}
