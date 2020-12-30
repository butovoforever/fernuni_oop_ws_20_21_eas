package ea2_4;

public class TestCarInterface {
    public static void main(String[] args) {
        // a)
        CarFactory NewCarFactory = new CarFactory();

        // b) ???? Wie kann ein Instanz von einem Interface erzeugt werden?
        Car NeuesAuto = NewCarFactory.giveMeACar();
        System.out.println(NeuesAuto.readMotorPowerInKiloWatt());

        // c)
        



    }
}
