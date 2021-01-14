package ea4_2;

public class TestMaximumContainer {
    public static void main(String[] args) {
        MaximumContainer<Obst> TestContainer = new MaximumContainer<Obst>();

        Äpfel n = new Äpfel(5);
        Äpfel o = new Äpfel(3);
        Äpfel p = new Äpfel(10);


        Birne k = new Birne(20);
        Birne l = new Birne(1);
        Birne m = new Birne(40);

        TestContainer.store(n);
        TestContainer.store(o);
        TestContainer.store(p);
        TestContainer.store(k);
        TestContainer.store(l);
        TestContainer.store(m);

        System.out.println(TestContainer.element.weight);
    }
}
