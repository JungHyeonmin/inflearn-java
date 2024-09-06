package exception.ex3.exception;

// 서버에 데이터를 전송을 실패한 예외
public class SendExceptionV3 extends NetworkClientExceptionV3 {
    private final String sendData;

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
