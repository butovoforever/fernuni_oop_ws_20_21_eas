class ZahlAusdenken {

    public static void main(String[] args) {
        // wir nehmen weiter der 1te Element auf "args"-String und versuchen es als int zu interpretieren und den startzahl"-Variabel zuweisen
        int startzahl = Integer.parseInt(args[0]);
        // wir zuweisen den Variabel "ergebnis" den Wert von "startzahl"
        int ergebnis = startzahl;

        // falls "ergebnis" ist groesser als 0, wird es um 2 inkrementiert, ansonsten im (-1) multipliziert und danach um 2 inkrementiert
        if (ergebnis > 0) {
            ergebnis = ergebnis + 2;
        } else {
            ergebnis = ergebnis * (-1) + 2;
        }

        // wir werden hier solange von "ergebnis" 2 substrahieren, bis es kleiner oder gleich 2 wird
        while (ergebnis > 2) {
            ergebnis = ergebnis - 2;
        }

        // wir zuweisen die Variabel arbeiten das Wert 4
        int arbeiten = 4;

        // danach wie addieren zu dem Wert von "arbeiten" der Wert von "startzahl" 11 Mal ;
        for (int i = 2; i <= 20; i = i + 2) {
            arbeiten = arbeiten + startzahl;
        }

        // Falls Ergebnis einer der unter "switch" stehenden Werten gleich ist, geben wir den entsprechenden Text aus und terminieren den Programm;
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

        // Falls Programm vorher ohne Fehler laufte, geben wir "startzahl = <Wert von startzahl>" aus;
        System.out.println("startzahl = " + startzahl);
    }
}