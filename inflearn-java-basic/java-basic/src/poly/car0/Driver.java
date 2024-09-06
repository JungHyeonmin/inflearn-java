package poly.car0;

public class Driver {
    private K3Car k3Car;
    private Model3Car model3Car;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        if (k3Car != null) {
            System.out.println("K3를 운전합니다.");
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3Car != null) {
            System.out.println("model3Car를 운전합니다.");
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }


}
