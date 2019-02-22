package mypack;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SingletonDatei {

	private final static String PFAD = "C:\\Java\\stueckliste.txt";
	private static PrintWriter pw = null;

	public static synchronized PrintWriter getInstance() {
		if (pw == null) {
			try {
				pw = new PrintWriter(PFAD);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return pw;
	}

	public static synchronized void close() {
		if (pw != null) {
			pw.close();
			pw = null;
		}
	}
}
