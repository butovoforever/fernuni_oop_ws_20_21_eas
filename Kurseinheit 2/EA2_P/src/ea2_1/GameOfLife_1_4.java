package ea2_1;

public class GameOfLife_1_4 {
    boolean[][] feld = {
            { false, false, false, false, false },
            { false, false, true, false, false },
            { false, false, true, false, false },
            { false, false, true, false, false },
            { false, false, false, false, false } 
        };
    
    public static void main(String[] args) {
    	GameOfLife_1_4 myGame = new GameOfLife_1_4();
        for (int i = 0; i < 10; i++) {
            myGame.nextGeneration();
            myGame.print();
            System.out.println();
            System.out.println();
        }
    }

    void print() {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (feld[i][j] == true)
                    System.out.print("o ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }

    void nextGeneration() {
        
    	int ZeilenGroesse = feld.length;
    	int SpaltenGroesse = feld[0].length;
    	
    	for (int i = 0; i < feld.length; i++) {
                if (feld[i].length != SpaltenGroesse) {
	                System.out.println("Ungueltige Feldformat");
	            	return;
                }
            }
    	
    	
    	
    	boolean[][] feld_neu = new boolean[ZeilenGroesse][SpaltenGroesse];

//    	for (int i = 0; i < feld.length; i++) {
//            for (int j = 0; j < feld[i].length; j++) {
//            	feld_neu[i][j] = feld[i][j];
//            }
//    	}
    	
    	for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
//            	System.out.println("alt_feld " + feld[i][j]);
            	if ( (i == 0) || (i == (ZeilenGroesse - 1)) || (j == 0) || (j == (SpaltenGroesse - 1)) )
	                {    
	                	feld_neu[i][j] = false;
	                }
                else
                    {
	                	int lebende_nachbarn = 0;
	                	for (int k = i - 1; k <= i + 1; k++) {
	                        for (int l = j - 1; l <= j + 1; l++) {
	    	                	
//	    	                	System.out.print("Zeile* " + k);
//	    	                	System.out.println(" & Spalte* " + l + ". Nachbarninkrementbedingung " + ( (k != i) && (l != j) && (feld[k][l] == true) ));
	    	                	
	                        	if ( !((k == i) && (l == j)) && (feld[k][l] == true) )
	                        		{
	                        			lebende_nachbarn = lebende_nachbarn + 1;
	                        		}
	                        	}
	                		}
	                	
//	                	System.out.print("Zeile " + i);
//	                	System.out.println(" & Spalte " + j);
//	                	System.out.println(lebende_nachbarn);
                	
	                	if ( (feld[i][j] == true) && ((lebende_nachbarn == 2) || (lebende_nachbarn == 3)) )
	                	{
	                		feld_neu[i][j] = true;
	                	} else if ((feld[i][j] == true) && ((lebende_nachbarn != 2) || (lebende_nachbarn != 3)))
	                	{
	                		feld_neu[i][j] = false;
	                	} else if ((feld[i][j] == false) && (lebende_nachbarn == 3))
	                	{
	                		feld_neu[i][j] = true;
	                	} 
	                	//else 
	                		if ((feld[i][j] == false) && (lebende_nachbarn != 3))
	                	{
	                		feld_neu[i][j] = false;
	                	}
	                	//System.out.println(lebende_nachbarn);
                    }
                	//System.out.println("neu_feld " + feld_neu[i][j]);
                	
            	}
    		}
    	
    	
    	feld = feld_neu;
    	
//    	for (int i = 0; i < feld.length; i++) {
//            for (int j = 0; j < feld[i].length; j++) {
//            	feld[i][j] = feld_neu[i][j];
//            }
//    	}
    	   	
    	
       }
    	
    	
    	/* 
			!1) Dimension der eingegebenen Feld bestimmen >> Anzahl der Spalten bestimmen + Gueltigkeit der Feld bestimmen
			2) ? Randen (2 Spaltenummern und 2 Zeilennummern) der Feld bestimmen - barucht man nur maximale Anzahl der Elementen in Zeilen (=Spalten)?
			3) Initialisierung der neuen zweidimensionalen boolean-Array : 
			4) Iterierung durch eingebene Feld
				4.1) Falls Zelle zu Randelementen gehoert - Zelle ist 'false'
				!4.2) Falls Zelle nicht zu Randelementen gehoert, dann
					!4.2.1) Falls Zelle 'true' ist
						zweidimensionale for-Schleife anwenden, wobei mit if-anweisung ueberpruefen ob Zelle, nicht aktuelle Zelle ist;
						4.2.1.1) .... und zwei oder drei der acht benachbarten Zellen 'true' sind, dann bleibt 'true'
						4.2.1.1) .... ansonsten wird 'false'
					4.2.2) Falls Zelle 'false' ist und drei ihrer acht Nachbarn 'true' sind, wird Zelle 'true', ansonsten bleibt 'false'
						zweidimensionale for-Schleife anwenden, wobei mit if-anweisung ueberpruefen ob Zelle, nicht aktuelle Zelle ist;
			5) neue Feld in alte ueberschrieben
         */
    	
    	
}
