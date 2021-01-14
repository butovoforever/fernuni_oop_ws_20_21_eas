package ea4_2;

public class MaximumContainer<T extends Comparable> {

		public T element;
		
		void store(T neuElement) {
			if (this.element == null || (this.element).compareTo(neuElement) > 0){
				this.element = neuElement;
			}
		}
		
		T get() {
			return element;
		}

}

abstract class Obst implements Comparable<Obst> {

	final int weight;

	Obst (int a) {
		this.weight = a;
	}

	public int compareTo(Obst o) {
		return  o.weight - this.weight;
	}
}

class Äpfel extends Obst {

	Äpfel (int a) {
		super(a);
	}

//	Äpfel (int a) {
//		this.weight = a;
//	}
}

class Birne extends Obst {

	Birne (int a) {
		super(a);
	}

//	Birne (int a) {
//		this.weight = a;
//	}
}


