package ea3_2;

public class MaximumContainer {

		public Object element;
		
		void store(Object neuElement) {
			if (((MaximumContainer) element).compareTo(neuElement) > 0)
			element = neuElement;
			

		}
		
		Object get() {
			return element;
		}
		
		public int compareTo(Object neuElement) {
			return ((MaximumContainer) element).compareTo(neuElement);
		};
		
}
