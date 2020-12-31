package ea2_4;

public class TestCarInterface {
    public static void main(String[] args) {
        // a)
        CarFactory NewCarFactory = new CarFactory();

        // b) ???? Wie kann ein Instanz von einem Interface erzeugt werden?
        Car NeuesAuto = NewCarFactory.giveMeACar();
        System.out.println(NeuesAuto.readMotorPowerInKiloWatt());

        // c) Fuer Car Objekt, der Supertyp der RealCar ist, kann ich Methode tunePower() von RealCar nicht zugreifen. Somit kann man Typconventierung anwenden und nocmal versuchen.

        RealCar NeuesAuto2 = (RealCar)NeuesAuto;
        NeuesAuto2.tunePower();

        System.out.println(NeuesAuto.readMotorPowerInKiloWatt());

    }
}
