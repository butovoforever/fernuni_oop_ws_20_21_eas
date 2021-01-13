package ea3_2;

public class TestMaximumContainer {
    public static void main(String[] args) {
        MaximumContainer<Obst> TestContainer = new MaximumContainer<Obst>();

        TestContainer.store(new Äpfel(5));
        TestContainer.store(new Äpfel(3));
        TestContainer.store(new Äpfel(10));
        TestContainer.store(new Birne(20));
        TestContainer.store(new Birne(1));
        TestContainer.store(new Birne(40));

        System.out.println(TestContainer.element.weight);
    }
}
