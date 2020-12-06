package einfuehrung_oop.ke1;

public class Ausnahmebehandlung_Matematiker_1_5 {
    public static void main(String[] args) {
        // Im allgemeinen, es wird ein Programmblockaufruf versucht, und auftretende Ausnahmen werden behandelt.
    	try {
    		//
    		try {
                int i = 7 % 5;
                //Rest von Division von 7 durch 5 ist 2. Denn Rest von Division von 2 durch 2 ist 0, erfolgt eine weitere Division durch 0, was erzeugt eine allgemeine Ausnahme (Exception), denn diese Situation in catch Anweisungen nicht speziell definiert ist. Weitere Ausfuehrung von Code unter try-Anweisung ist somit abgebrochen.
                if ((i / (i % 2)) == 1) {
                    throw new Exception();
                }               
                System.out.println("Ich mag");
            }
//Hier ist vorher bemerkte Ausnahme (allgemeine) behandelt, somit folgt Ausgabe von "Ich liebe" mit Uebergang auf naechste Zeile.
    		catch (Exception e) {
                System.out.println("Ich liebe");
//Weiter erfolgt wieder eine Division durch 0, und eine allgemeine Ausnahme ist erfolgt und behandelt - das ergibt die Ausgabe von "es," mit Uebergang auf naechste Zeile.
                try {
                    if ((7 % 6 / (7 % 6 % 2)) == 1) {
                        throw new Exception();
                    }
                    System.out.println("nichts mehr, als");
                } catch (Exception u) {
                    System.out.println("es,");
                }
            }
//Hier ist "wenn" ausgegeben, mit Uebergang auf naechste Zeile.
    		System.out.println("wenn");
//Danach folgt Auswertung von "true & false ? 0 : 1" (sogenannte "Ternary-operator"), was erzeugt Zuweisung von 1 zu Integer-Variabel "i" (denn "true & false" erzeugt false).
    		try {
                int i = true & false ? 0 : 1;
//Denn i=1 ist, erfolgt, durch Ausvertung von switch-Anweisung, Ausgabe von "ein Programm" mit Uebergang auf naechste Zeile.
                switch (i) {
                case 0:
                    System.out.println("eine Formel");
                case 1:
                    System.out.println("ein Programm");
//Denn nach Ausfuehrung von Anweisung unter "case 1" Ausfuehrung von switch-Anweisung ist nicht abgebrochen, eine allgemeinere Ausnahme (Exception) ist wieder erzeugt.
                default:
                    throw new Exception();
                }

    		} catch (ArithmeticException e) {
                System.out.println("abbricht.");
//Denn allgemeinere Ausnahme (Exception) ist wieder erzeugt, erfolgt Ausgabe von "funktioniert." mit Uebergang auf naechste Zeile.
    		} catch (Exception e) {
                System.out.println("funktioniert.");
            }
//Weil eine mit catch-Anweisung definierte Ausnahme schon behandelt war, treten wir laufende try-catch-Anweisung aus, und finally-Anweisung ist nicht ausgefuehrt.
            finally {
                int i = false && true ? 0 : 2;
                switch (i) {
                case 1:
                    System.out.println(";)");
                default:
                    throw new Exception();
                }
            }
//Denn keine Ausnahmen auf diese Niveau erzeugt waren, werden weitere 2 catch-Anweisungen nicht ausgefuehrt, und Programm terminiert hier normal.
    	} catch (ArithmeticException e) {
            System.out.println(":(");
        } catch (Exception e) {
            System.out.println(" ");
        }
    }
}
