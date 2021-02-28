package ea4_4;

import java.io.IOException;

//wir definieren hier ein Interface
  interface CharEingabeStrom {
    int read() throws IOException;
  }

//wir definieren hier eine Klasse Stringleser, mit: 1) privatem Attribut dieZeichen, der ein Array von elementaren Typ
// "char"
// ist; 2) Attribut index, der von elementaren Typ "int" ist;
  class StringLeser implements CharEingabeStrom {
    private char[] dieZeichen;
    private int index = 0;

//hier definieren wir ein Konstruktor, wo Wert aus ein "String" Wert dem "dieZeichen" mittels String.toCharArray
// zugewiesen ist
    public StringLeser(String s) { dieZeichen = s.toCharArray(); }

//hier definieren wir ein Methode, der -1 zurueckgibt, falls Wert von "index" <Anzahl der Zeichen in die Zeichen - 1> uebersteigt;
// ansonsten, ist um 1 erhobene Wert von "index" zurueckgegeben;
    public int read() {
      if(index == dieZeichen.length) return -1;
     else return dieZeichen[index++];
   }
 }

//hier definieren wir Klasse "GrossBuchstabenFilter", mit privaten Attribut "eingabeStrom", der von Interface-Typ
// "CharEingabeStrom" ist , der Superklass fuer Klasse StringLeser ist;
 class GrossBuchstabenFilter implements CharEingabeStrom {
   private CharEingabeStrom eingabeStrom;

//Danach definieren wir geigneten Konstruktor der Klasse "GrossBuchstabenFilter", der dem Attribut "eingabeStrom" ein Wert der interface-Typ
// CharEingabeStrom (oder der Objekt der Klasse, der von CharEingabeStrom erbt) zuweist;
   public GrossBuchstabenFilter(CharEingabeStrom cs) { eingabeStrom = cs; }

//Hier definieren wir ein Methode "read" der Klasse "GrossBuchstabenFilter", der auf "eingabeStrom" Methode "read" anwendet. Dieser Methode gehoert zu
// Objekt, dessen Supertyp interface CharEingabeStrom ist. Falls eingabeStrom.read() gibt -1 aus, dann gibt "read"
// Methode von Klasse GrossBuchstabenFilter -1 aus. Ansonsten, wird eingabeStrom.read() ins Typ char umgewandelt, und
// zusaetzlich ist darauf toUpperCase Methode angewendet und Ergebnis wird ausgegeben.
   public int read() throws IOException {
     int z = eingabeStrom.read();
     if(z == -1) return -1;
     else return Character.toUpperCase((char)z);
   }
 }


//Hier definieren wir der Klasse UmlautSzFilter, mit 1) privaten Attribut "eingabeStrom", der von Interface-Typ
// "CharEingabeStrom" ist; 2) privaten Attribut "naechstesZ" von primitiven Typ "int", der sofort mit Wert -1 initialisiert wird.
// Konstruktor der Klasse weist der eingegebene Objekt der CharEingabeStrom instance-Klasse dem Attribut
// "eingabeStrom" zu. Methode "read" gibt das Wert von "naechstesZ" aus, falls die ungleich -1 ist, und danach wird dem
// "naechstesZ" das Wert von -1 zugeordnet. Wenn das nicht der Fall ist, und eingabeStrom.read() -1 zurueckgibt, dann
// wird UmlautSzFilter.read -1 ausgeben. Ansonsten, wird UmlautSzFilter.read ausgehend von eingabeStrom.read() Ausgabe,
// statt Umlaut entsprechende Buchstabe und "e" ausgeben (oder statt "ß" wird "ss" ausgegeben), oder eingabeStrom.read() Ausgabe selbst.

 class UmlautSzFilter implements CharEingabeStrom {
   private CharEingabeStrom eingabeStrom;
   private int naechstesZ = -1;

   public UmlautSzFilter(CharEingabeStrom cs) { eingabeStrom = cs; }

   public int read() throws IOException {
     if(naechstesZ != -1) {
       int z = naechstesZ;
       naechstesZ = -1;
       return z;
     } else {
       int z = eingabeStrom.read();
       if(z == -1)  return -1;
       switch((char)z) {
         case '\u00C4':  naechstesZ = 'e'; return 'A';
         case '\u00D6':  naechstesZ = 'e'; return 'O';
         case '\u00DC':  naechstesZ = 'e'; return 'U';
         case '\u00E4':  naechstesZ = 'e'; return 'a';
         case '\u00F6':  naechstesZ = 'e'; return 'o';
         case '\u00FC':  naechstesZ = 'e'; return 'u';
         case '\u00DF':  naechstesZ = 's'; return 's';
         default:        return z;
       }
     }
   }
 }


//Zuerst wird ein String-Objekt erzeugt, der das Wert "fßÖ" hat.
// Dann wird eine Kette von vorher erwaehnte Klassen erzeugt, wobei Referenzen auf Objekten von 2 Klassen als
// Konstruktor Eingabe der anderen Klassen benuetzt wird: StringLeser wird ins UmlautSzFilter uebergeben und
// UmlautSzFilter - ins GrossBuchstabenFilter. Wir benuetzen dann der "read" Methode der GrossBuchstabenFilter
// Klasse, der dann je nachdem Bedingungen auch "read" Methoden der Klassen UmlautSzFilter und
// StringLeser aufruft. Jede Buchstabe ins "StringLeser.dieZeichnen" wird dann gegebenfalls nach UmlautSzFilter
// umgesetzt, und dann als grosse Buchstabe ausgegeben (alle in eine Zeile). Schliesslich wird ein Uebergang auf
// naechste Zeile aufgenommen. Erste Buchstabe wird "F" sein.

 public class Main {
   public static void main(String[] args) throws IOException {
     String s = new String("f\u00DF\u00D6");

     CharEingabeStrom cs;
     cs = new StringLeser( s );

// Wenn man naechste 2 Zeilen vertauscht wird bei ß Verarbeitung nur kleine s ausgegeben, und bei Umlauten - 1ste
// Buchstabe als grose, und 2te als kleine. Also, da wird in unserem Fall "FssOe" ausgegeben.
     cs = new UmlautSzFilter( cs );
     cs = new GrossBuchstabenFilter( cs );

     int z = cs.read();
     while(z != -1) {
       System.out.print((char)z);
       z = cs.read();
     }
     System.out.println("");
   }
 }



