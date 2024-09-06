package exception.ex4.exception;


// 서버에 접속을 실패한 예외
public class ConnectExceptionV4 extends NetworkClientExceptionV4 {

    private final String address;

    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

}
