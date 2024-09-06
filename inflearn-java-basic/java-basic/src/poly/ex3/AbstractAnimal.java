package poly.ex3;

public abstract class AbstractAnimal {
    
    // 추상 메서드 - 자식 클래스에서 무조건 오버라이딩 해야한다.
    public abstract void sound();
    

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
