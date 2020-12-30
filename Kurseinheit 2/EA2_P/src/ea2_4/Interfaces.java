package ea2_4;

interface Car {
    String readMotorPowerInKiloWatt();
}

class RealCar implements Car {
    private double power;

    public RealCar(double power) {
        this.power = power;
    }

    public String readMotorPowerInKiloWatt() {
        return "Car: My power is " + power + " KW!";
    }

    // Methode zum Tunen des Autos
    public void tunePower() {
        power = power * 1.2;
    }
}

class CarFactory {
    public Car giveMeACar() {
        return new RealCar(98);
    }
}