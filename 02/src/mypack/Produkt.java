package mypack;

public abstract class Produkt {
	
	private String name;
	private int anzahl;
	private int ebene;
	
	public void drucken() {
		
	}
	
	public Produkt() {
		new ZustandInArbeit(this);
	}
	
}
