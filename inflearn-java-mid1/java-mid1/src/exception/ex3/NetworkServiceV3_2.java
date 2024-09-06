package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;

public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);
        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) { // 우선순위 1
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) { // 우선순위 2 - 우선순위 1에서 잡히지 않은 오류를 잡는다.
            System.out.println("[네트워크 오류] 메시지 : " + e.getMessage());
        } catch (Exception e) { // 우선순위 3
            System.out.println("[알 수 없는 오류] 메시지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}