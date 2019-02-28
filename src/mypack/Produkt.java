package mypack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class Produkt {

	private Zustand zustand;
	private int ebene;
	private String name;
	private int anzahl;
	private List<Produkt> knoten;

	public Produkt(String name, int anzahl) {
		ebene = 0;
		this.name = name;
		this.anzahl = anzahl;
		knoten = new ArrayList<>();
		zustand = new ZustandInArbeit();
	}

	public final void produktFreigeben() {
		zustand = zustand.produktFreigeben();
	}

	public final void produktBearbeiten() {
		zustand = zustand.produktBearbeiten();
	}

	public void hinzufuegen(Produkt p) {
		p.ebene = ebene + 1;
		knoten.add(p);
	}

	public void entfernen(String produktMussWeg) {
		for (Iterator<Produkt> it = knoten.iterator(); it.hasNext();) {
			Produkt p = it.next();
			if (p.name == produktMussWeg) {
				it.remove();
			} else {
				p.entfernen(produktMussWeg);
			}
		}
	}

	public void drucken() {
		System.out.println(getPadding() + getProdukt() + ": " + getContent());
		knoten.forEach(p -> p.drucken());
	}

	private String getPadding() {
		if (ebene > 0) {
			char[] padding = new char[ebene];
			Arrays.fill(padding, '\t');
			return new String(padding);
		}
		return "";
	}

	protected abstract String getProdukt();

	private String getContent() {
		return anzahl + " x " + name;
	}

	public void speichern() {
		rekursivSpeichern();
		SingletonDatei.close();
	}

	private void rekursivSpeichern() {
		SingletonDatei.getInstance().println(getPadding() + getContent());
		knoten.forEach(p -> p.rekursivSpeichern());
	}
}
