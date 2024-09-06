package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        // 다형적 참조(Animal animal)로 하위 클래스를 모두 메서드에 적용시킬 수 있다.
        // 메서드 오버라이딩으로 자식 클래스의 메서드를 실행한다.
        System.out.println("\n동물 소리 테스트 시작");
        animal.sound();
        moveAnimal(animal);
        System.out.println("동물 소리 테스트 종료\n");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        animal.move();
    }
}
