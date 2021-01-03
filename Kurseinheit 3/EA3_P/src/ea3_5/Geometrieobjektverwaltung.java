package ea3_5;

abstract class Geometrieobjekt {

    public abstract boolean istPunktsymmetrisch();
    public abstract boolean istGeschlossen();

    void druckeEigenschaften(){
        if (istGeschlossen()) {
            System.out.println("Ist geschlossen.");
        } else {
            System.out.println("Ist nicht geschlossen.");
        }

        if (istPunktsymmetrisch()) {
            System.out.println("Ist punktsymmetrisch.");
        } else {
            System.out.println("Ist nicht punktsymmetrisch.");
        }
    }


}

class Kreis extends Geometrieobjekt {

    public boolean istPunktsymmetrisch() {
        return true;
    }

    public boolean istGeschlossen() {
        return true;
    }

}

class Bogenstueck extends Geometrieobjekt {

    public boolean istPunktsymmetrisch() {
        return false;
    }

    public boolean istGeschlossen() {
        return false;
    }

}

class Rechteck  extends Geometrieobjekt {

    public boolean istPunktsymmetrisch() {
        return true;
    }

    public boolean istGeschlossen() {
        return true;
    }

}


class Geometrieobjektverwaltung {
    public static void main(String[] args) {
        Geometrieobjekt geometrieobjekt = null;

        if (args[0].equals("Kreis"))
            geometrieobjekt = new Kreis();
        if (args[0].equals("Bogenstueck"))
            geometrieobjekt = new Bogenstueck();
        if (args[0].equals("Rechteck"))
            geometrieobjekt = new Rechteck();
        /* ... */
        if (geometrieobjekt == null) {
            System.out.println("Ein " + args[0]
                    + " ist bisher nicht implementiert");
        } else {
            geometrieobjekt.druckeEigenschaften();
        }
    }
}
