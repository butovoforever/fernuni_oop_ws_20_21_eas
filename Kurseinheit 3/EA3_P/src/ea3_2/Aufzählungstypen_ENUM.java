package ea3_2;

public class Aufzählungstypen_ENUM {
    

    /*
     * Erwartete Ausgabe ist:
     *
     * Helfer
     * Truppfuehrer
     * Gruppenfuehrer
     * Zugtruppfuehrer
     * Zugfuehrer
     * false
     * true
     * false
     *
     */
    public static void main(String[] args) {
        printAll();
        System.out.println(HELFER.istVorgesetzterVor(GRUPPENFUEHRER));
        System.out.println(TRUPPFUEHRER.istVorgesetzterVor(HELFER));
        System.out.println(GRUPPENFUEHRER.istVorgesetzterVor(GRUPPENFUEHRER));
    }
}
