package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Cat cat = new Cat();

        Cow cow = new Cow();
        Cow cow1 = new Cow();
        Cow cow2 = new Cow();

        Cow [] cowArray = {cow, cow1, cow2};

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        sound(cat);

        for (Cow cow3 : cowArray) {
            sound(cow);
        }
    }

    private static void sound(Cow cow) {
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");

    }

    private static void sound(Cat cat) {
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

    }
}
