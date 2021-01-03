//package einfuehrung_oop.ke1;

//Fallunterscheidungen
public class Aufgaben_1_2_a {
	
	public static void main(String[] args) {
    
		if (args.length == 0) {
			System.out.println("Geben Sie bitte was ein!");
			return;
		}

		//ich ueberpruefe ob Eingabe zu implementierte Figuren gehoert
		if (
					!(args[0].toLowerCase().equals("strecke"))
					&
					!(args[0].toLowerCase().equals("dreieck"))
					&
					!(args[0].toLowerCase().equals("rechtwinkliges dreieck"))
					&
					!(args[0].toLowerCase().equals("kreis"))
					&
					!(args[0].toLowerCase().equals("ellipse"))
					&
					!(args[0].toLowerCase().equals("viereck"))
					&
					!(args[0].toLowerCase().equals("parallelogram"))
					&
					!(args[0].toLowerCase().equals("paralleltrapez"))
					&
					!(args[0].toLowerCase().equals("gerade"))
					&
					!(args[0].toLowerCase().equals("rhombus"))
				
				) 
                {
                    System.out.println(args[0].toLowerCase() + " Nicht implementiert");
                    return;
                    }
		
		//Eckenanzahl
		if (
					(args[0].toLowerCase().equals("strecke"))
					|
					(args[0].toLowerCase().equals("kreis"))
					|
					(args[0].toLowerCase().equals("ellipse"))
					|
					(args[0].toLowerCase().equals("gerade"))
				)		
		{
			System.out.println(args[0] + " hat keine Ecken");
		} 
		
		else if (
					(args[0].toLowerCase().equals("dreieck"))
					|
					(args[0].toLowerCase().equals("rechtwinkliges dreieck"))
				)		
		{
			System.out.println(args[0] + " hat 3 Ecken");
		} 
		
		else if (
					(args[0].toLowerCase().equals("viereck"))
					|
					(args[0].toLowerCase().equals("parallelogram"))
					|
					(args[0].toLowerCase().equals("paralleltrapez"))
					|
					(args[0].toLowerCase().equals("rhombus"))
				)		
		{
			System.out.println(args[0] + " hat 4 Ecken");
		}
		
		
		//Symmetrieachsenzahl
		if (
					(args[0].toLowerCase().equals("strecke"))
					|
					(args[0].toLowerCase().equals("rechtwinkliges dreieck"))
				)		
		{
			System.out.println(args[0] + " hat je nachdem Seitenverhaltnis/Achsenposition 1 oder keine Symmetrieachsen");
		} 
		
		else if (
					(args[0].toLowerCase().equals("dreieck"))
				)		
		{
		System.out.println(args[0] + " hat je nachdem Seitenverhaltnis 0, 1 oder 3 Symmetrieachsen");
		} 
		
		else if (
					(args[0].toLowerCase().equals("viereck"))
					|
					(args[0].toLowerCase().equals("paralleltrapez"))
				)	
		{
		System.out.println(args[0] + " hat je nachdem Seitenverhaltnis 0, 1, 2 oder 4 Symmetrieachsen");
		} 
		
		else if (
					(args[0].toLowerCase().equals("parallelogram"))
				)	
		{
		System.out.println(args[0] + " hat je nachdem Seitenverhaltnis 0, 2 oder 4 Symmetrieachsen");
		} 
		
		else if (
					(args[0].toLowerCase().equals("ellipse"))
					|
					(args[0].toLowerCase().equals("rhombus"))
				)	
		{
		System.out.println(args[0] + " hat immer 2 Symmetrieachsen");
		} 
		
		else if (
					(args[0].toLowerCase().equals("kreis"))
					|
					(args[0].toLowerCase().equals("gerade"))
				)	
		{
		System.out.println(args[0] + " hat immer unendlich viele Symmetrieachsen");
		}
		
		//ob ist punktsymmetrisch
		if (
					(args[0].toLowerCase().equals("dreieck"))
					|
					(args[0].toLowerCase().equals("rechtwinkliges dreieck"))
				)		
		{
			System.out.println(args[0] + " ist nie punktsymmetrisch");
		} 
		
		else if (
					(args[0].toLowerCase().equals("viereck"))
					|
					(args[0].toLowerCase().equals("parallelogram"))
					|
					(args[0].toLowerCase().equals("paralleltrapez"))
				)	
		{
			System.out.println(args[0] + " je nachdem Seitenverhaltnis ist punktsymmetrisch");
		} 
		
		else if (
					(args[0].toLowerCase().equals("strecke"))
					|
					(args[0].toLowerCase().equals("kreis"))
					|
					(args[0].toLowerCase().equals("ellipse"))
					|
					(args[0].toLowerCase().equals("gerade"))
					|
					(args[0].toLowerCase().equals("rhombus"))
				)	
		{
			System.out.println(args[0] + " ist immer punktsymmetrisch");
		}
		
		//ob ist geschlossen
		if (
					(args[0].toLowerCase().equals("strecke"))
					|
					(args[0].toLowerCase().equals("gerade"))
				)		
		{
			System.out.println(args[0] + " ist offen");
		}
		
		else 		
		{
			System.out.println(args[0] + " ist geschlossen");
		}


		
	}
	
}
