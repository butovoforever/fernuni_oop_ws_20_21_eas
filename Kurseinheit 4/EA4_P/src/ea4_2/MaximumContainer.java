package ea3_2;

public class MaximumContainer<T extends Comparable> {

		public T element;
		
		void store(T neuElement) {
			if ((this.element).compareTo(neuElement) > 0)
			element = neuElement;
		}
		
		Object get() {
			return element;
		}



}

abstract class Obst implements Comparable<Obst> {

	int weight;

	public int compareTo(Obst o) {
		return this.weight - o.weight;
	}
}

class Äpfel extends Obst {

	Äpfel (int a) {
		this.weight = a;
	}
}

class Birne extends Obst {

	Birne (int a) {
		this.weight = a;
	}
}


