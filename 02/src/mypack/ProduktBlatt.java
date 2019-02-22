package mypack;

public class ProduktBlatt extends Produkt {

	public ProduktBlatt(String name, int anzahl) {
		super(name, anzahl);
	}

	@Override
	public final void hinzufuegen(Produkt p) {
		return;
	}

	@Override
	public final void entfernen(String produktMussWeg) {
		return;
	}

	@Override
	protected String getProdukt() {
		return "ProduktBlatt";
	}
}
