package einfuehrung_oop.ke1;

//Aufgabe_1_3_a_bis_c
public class Summierer_1_3_a_bis_c {
    public static void main(String[] args) {
        Summierer_1_3_a_bis_c summierer = new Summierer_1_3_a_bis_c();
		if (args.length == 0) {
			System.out.println("Geben Sie bitte was ein!");
			return;
		}
		

		
		try {
        int n = Integer.parseInt(args[0]);

			if (Integer.parseInt(args[0]) < 0) {
				System.out.println("Geben Sie bitte Integer ein, die groesser oder gleich 0 ist!");
				return;
			}
        
        System.out.println("Ergebnis kleiner Gauss: " + summierer.kleinerGauss(n));		
        System.out.println("Ergebnis mit for-Schleife: " + summierer.forSumme(n));
        System.out.println("Ergebnis rekursiv: " + summierer.rekursiveSumme(n));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Ungueltige Zahlformat, muss Integer sein");
			return;
		} catch (StackOverflowError e) {
			// TODO Auto-generated catch block
			System.out.println("deine Programm ist mit diesen Schleifentyp ist zu schwer, bitte anderen Verfahren verwenden");
			return;
		}
    }


    int kleinerGauss(int n) { 
    	int summe = n * (n+1) / 2 ;
    	return summe;
    	}

    int forSumme(int n) {
    	int summe = 0;
    	for (int i = 1; i <= n; i++ ) {
    		summe = summe + i;
    	}
    	return summe;
    }

    int rekursiveSumme(int n) {      	
    	if (n == 0) {
        	return 0;
    	}    	
    	return n + rekursiveSumme(n - 1);    	
    }
    

    
}
