package poly.ex4;

public class Dog extends InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
    
    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
