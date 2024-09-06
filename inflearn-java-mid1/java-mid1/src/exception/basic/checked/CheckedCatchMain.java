package exception.basic.checked;

public class CheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatched();
        System.out.println("정상 종료");

        // service.catchThrows();
    }
}
