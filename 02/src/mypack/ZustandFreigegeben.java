package mypack;

public class ZustandFreigegeben extends Zustand {

	@Override
	public Zustand produktBearbeiten() {
		System.out.println("Neuer Zustand: In Arbeit");
		return new ZustandInArbeit();
	}

	@Override
	public Zustand produktFreigeben() {
		System.out.println("Funktioniert nicht: Doppelte Freigabe");
		return this;
	}
}
