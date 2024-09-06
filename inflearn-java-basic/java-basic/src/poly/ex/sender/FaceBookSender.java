package poly.ex.sender;

public class FaceBookSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북을 발송합니다 :" + message);
    }
}
