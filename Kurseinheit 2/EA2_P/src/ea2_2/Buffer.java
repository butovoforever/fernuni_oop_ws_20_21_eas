
package ea2_2;

class Buffer {
	private Entry erste_element;
	private Entry aktuelle_element;
	private Entry letzte_frei;
	private Entry letzte_element;
	
	public static void main(String[] args) {
		
		//System.out.println(n);
//		Buffer myBuffer = new Buffer (5);
//
//		myBuffer.insert ("ich");
//		myBuffer.insert ("wird");
//		myBuffer.insert ("alles");
//		myBuffer.insert ("unbedingt");
//		myBuffer.insert ("schaffen");
//		myBuffer.insert ("schaffen");
//		myBuffer.insert ("wird");
//		myBuffer.insert ("unbedingt");
//		myBuffer.insert ("alles");
//		myBuffer.insert ("ich");
//		myBuffer.print();
	}
	
	public Buffer (int n) {
		//int l;
		erste_element = new Entry(null,null,null);
		aktuelle_element = erste_element;

//		aktuelle_element.next = aktuelle_element;
//		aktuelle_element.previous = aktuelle_element;
		letzte_element = aktuelle_element;
		//= buffer_element;
		for (int l = 0; l < n-1; l++) {
//			buffer_element.next = new Entry();
//			buffer_element.next.previous = buffer_element;
			
			aktuelle_element.next = new Entry(null,null,null);
			letzte_element = aktuelle_element.next;
			letzte_element.previous = aktuelle_element;
			aktuelle_element = letzte_element;		
			
		}
		letzte_element.next = erste_element;
		erste_element.previous = letzte_element;
		letzte_frei = erste_element;
	}
	
	//JETZT DIE METHODEN
	
	private class Entry {
		private String element;
		private Entry next;
		private Entry previous;
			private Entry(String element, Entry next, Entry previous) {
				this.element = element;
				this.next = next;
				this.previous = previous;
			}
		}
	
	 void insert (String s) {
		
		letzte_frei.element = s;
		letzte_frei = letzte_frei.next;
		
	} 
	
	 void print () {
		Entry iterirer_element = erste_element;
		do {
			System.out.println(iterirer_element.element + " ");
			iterirer_element = iterirer_element.next;
		} while (iterirer_element != letzte_element.next);
	} 
	
}
