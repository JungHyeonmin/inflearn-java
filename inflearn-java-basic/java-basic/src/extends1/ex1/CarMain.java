package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        // 전기차
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        // 기름차
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }

}
