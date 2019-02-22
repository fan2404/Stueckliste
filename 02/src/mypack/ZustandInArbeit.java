package mypack;

public class ZustandInArbeit extends Zustand {

	@Override
	public Zustand produktFreigeben() {
		System.out.println("Neuer Zustand: Freigegeben");
		return new ZustandFreigegeben();
	}

	@Override
	public Zustand produktBearbeiten() {
		System.out.println("Funktioniert: In Arbeit bleibt");
		return new ZustandInArbeit();
	}
}
