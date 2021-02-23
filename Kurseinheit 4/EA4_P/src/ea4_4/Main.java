package ea4_4;

import java.io.IOException;

//wir definieren hier ein Interface
  interface CharEingabeStrom {
    int read() throws IOException;
  }

//wir definieren hier eine Klasse Stringleser, mit: 1) Attribut dieZeichen, der ein Array von elementaren Typ "char"
// ist; 2) Attribut index, der von elementaren Typ "int" ist;
  class StringLeser implements CharEingabeStrom {
    private char[] dieZeichen;
    private int index = 0;

//hier definieren wir ein Konstruktor, wo Wert von dieZeichen aus ein "String" Wert mittels toCharArray zugewiesen ist
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
// Methode von Klasse GrossBuchstabenFilter -1 aus. Ansonsten, ist eingabeStrom.read() ins Typ char umgewandelt, und
// zusaetzlich ist darauf toUpperCase Methode angewendet und Ergebnis ist ausgegeben.
   public int read() throws IOException {
     int z = eingabeStrom.read();
     if(z == -1) return -1;
     else return Character.toUpperCase((char)z);
   }
 }


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

 public class Main {
   public static void main(String[] args) throws IOException {
     String s = new String("f\u00DF\u00D6");

     CharEingabeStrom cs;
     cs = new StringLeser( s );
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
