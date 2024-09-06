package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        // 전기차
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        // 기름차
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();
        // 기름차
        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogenUp();
        hydrogenCar.openDoor();
    }
}