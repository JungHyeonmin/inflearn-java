package poly.ex2;

public class AnimalSoundMain1 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();
        Duck duck = new Duck();


        soundAnimal(cat);
        soundAnimal(cow);
        soundAnimal(dog);
        soundAnimal(duck);
    }

    private static void soundAnimal(Animal animal) {
        // 다형적 참조(Animal animal)로 하위 클래스를 모두 메서드에 적용시킬 수 있다.
        // 메서드 오버라이딩으로 자식 클래스의 메서드를 실행한다.
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료\n");

    }
}
