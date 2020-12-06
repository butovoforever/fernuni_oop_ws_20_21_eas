package einfuehrung_oop.ke1;

public class Aufgaben_1_1_c {
	public static void main(String[] args) {

		int startzahl;
		if (args.length == 0) {
			System.out.println("Geben Sie bitte was ein!");
			return;
		}

		try {
			startzahl = Integer.parseInt(args[0]);
			int ergebnis = startzahl;

			System.out.println("Das war kein gueltige Integerzahl!");

			if (ergebnis > 0) {
				ergebnis = ergebnis + 2;
			} else {
				ergebnis = ergebnis * (-1) + 2;
			}
			while (ergebnis > 2) {
				ergebnis = ergebnis - 2;
			}
			int arbeiten = 4;
			for (int i = 2; i <= 20; i = i + 2) {
				arbeiten = arbeiten + startzahl;
			}
			switch (ergebnis) {
			case 0:
				System.out.println("Das kann nicht sein!");
				break;
			case 1:
				System.out.println("Die urspruengliche Zahl war ungerade!");
				break;
			case 2:
				System.out.println("Die urspruengliche Zahl war gerade!");
				break;
			default:
				System.out.println("Fehler!");
			}
			System.out.println("startzahl = " + startzahl);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Ungueltige Zahlformat, muss Integer sein");
			return;
		}

	}
}
