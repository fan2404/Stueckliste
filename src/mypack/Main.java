package mypack;

public class Main {

	public static void main(String[] args) {
		Produkt fahrrad = new ProduktStueckliste("Fahrrad", 1);
		Produkt rad = new ProduktStueckliste("Rad", 2);
		Produkt rahmen = new ProduktBlatt("Rahmen", 1);
		Produkt schraubeA = new ProduktBlatt("Schraube", 8);
		Produkt schraubeB = new ProduktBlatt("Schraube", 2);
		Produkt felge = new ProduktBlatt("Felge", 1);

		fahrrad.hinzufuegen(rad);
		fahrrad.hinzufuegen(rahmen);
		fahrrad.hinzufuegen(schraubeA);
		rad.hinzufuegen(schraubeB);
		rad.hinzufuegen(felge);

		// 1
		fahrrad.drucken();
		System.out.println();
		// 2
		fahrrad.speichern();
		// 3
		fahrrad.produktFreigeben();
		fahrrad.produktFreigeben();
		fahrrad.produktBearbeiten();
		fahrrad.produktBearbeiten();
		System.out.println();
		// 4
		fahrrad.entfernen("Schraube");
		fahrrad.drucken();
	}
}
