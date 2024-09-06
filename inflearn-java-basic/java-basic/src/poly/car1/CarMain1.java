package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        // == Car car = k3Car; 부모는 자식을 담을 수 있다.
        driver.drive();

        System.out.println();

        // 차량 변겅 (k3 -> model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        System.out.println();

        // 차량 변경(model3 -> newcar
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
