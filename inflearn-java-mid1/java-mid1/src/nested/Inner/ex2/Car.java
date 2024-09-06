package nested.Inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(); // 내부 클래스 접근을 위해서 생성
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine {
        // Car에 대한 정보를 안받아도 없어도 인스턴스 멤버라서 알 수 있다.
       

        public void start() {
            System.out.println("충전 레벨 확인 : " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }

    }

}