package ea3_2;

enum Dienstgraden {
    HELFER("Helfer"),
    TRUPPFUEHRER("Truppführer"),
    GRUPPENFUEHRER("Gruppenführer"),
    ZUGTRUPPFUEHRER("Zugtruppführer"),
    ZUGFUEHRER("Zugführer");

    public final String Name;

    Dienstgraden(String name) {
        this.Name = name;
    }

    static void printAll(){
        Dienstgraden[] dienstgraden = Dienstgraden.values();
        for (Dienstgraden d : dienstgraden) {
            System.out.println(d.Name);
        }
    }


    boolean istVorgesetzterVor(Dienstgraden d){
        return this.ordinal() > d.ordinal();
    }


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

