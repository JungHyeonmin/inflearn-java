package exception.ex2;



// 복잡한 NetworkClient사용 로직을 처리한다.
public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data); // 추가

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
