package exception.ex2;


// 복잡한 NetworkClient사용 로직을 처리한다.
public class NetworkServiceV2_3 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data); // 추가

        try { // 예외 발생할 것같은 부분에 정상흐름을 넣는다.
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) { // 예외를 잡는 부분
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
            return; // send로 안가도록 종료하기
        }
    }
}
