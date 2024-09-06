package extends1.overliding;

public class CarMain {
    public static void main(String[] args) {
        // 전기차
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        // 기름차
        GasCar gasCar = new GasCar();
        gasCar.move();
        
        // 수소차
        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
    }
}