package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        // 부모는 자식을 담을 수 있다.
        Object object = new Dog();

        action(car);
        action(dog);

    }

    private static void action(Object obj) {
        // 상위 클래스는 하위 클래스의 요소를 모른다. 그래서 오류가 생긴다.
        // obj.sound(); // 컴파이 오류, Object는 sound()가 없다.
        // obj.move(); // 컴파이 오류, Object는 move()가 없다.
        Dog dog = new Dog();
        // 해결방법 - 다운 캐스팅
        if (obj instanceof Car car) { // 자바 16 사용 방법
            car.move();
        }else if (obj instanceof Dog) { // 기본 사용 방법
            obj = new Dog();
            ((Dog)obj).sound(); 
        }
    }
}
