package ea2_2;

public class BufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(n);
		Buffer myBuffer = new Buffer (7);
		
		myBuffer.insert ("ich");
		myBuffer.insert ("wird");
		myBuffer.insert ("alles");
		myBuffer.insert ("unbedingt");
		myBuffer.insert ("schaffen");
		myBuffer.insert ("schaffen");
		myBuffer.insert ("wird");
		myBuffer.insert ("unbedingt");
		myBuffer.insert ("alles");
		myBuffer.insert ("ich");
		myBuffer.print();
		
	}

}
