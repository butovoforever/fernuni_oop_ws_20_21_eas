package ea4_2;

public class TestMaximumContainer {
    public static void main(String[] args) {
        MaximumContainer<Obst> TestContainer = new MaximumContainer<Obst>();

        Äpfel n = new Äpfel(5);
        Äpfel o = new Äpfel(3);
        Äpfel p = new Äpfel(90);

        Birne k = new Birne(20);
        Birne l = new Birne(1);
        Birne m = new Birne(140);

        TestContainer.store(n);
        TestContainer.store(o);
        TestContainer.store(p);
        TestContainer.store(k);
        TestContainer.store(l);
        TestContainer.store(m);

        Obst x = TestContainer.get();

        System.out.println(x.weight);


    }
}
