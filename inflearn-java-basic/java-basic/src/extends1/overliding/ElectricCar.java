package extends1.overliding;

public class ElectricCar extends Car {
    @Override // 메서드 오버라이딩
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
    public void charge() {
        System.out.println("충전합니다.");
    }
}