package exception.ex1;


// 복잡한 NetworkClient사용 로직을 처리한다.
public class NetworkServiceV1_3 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data); // 추가

        // 정상 흐름과 예외 흐름이 섞여있기 때문에 코드가 복잡하고 어지럽다..
        // 가장 중요한 것은 정상흐름이 눈에 들어오는 것이다.
        // 예외 흐름음 실무에서 너~무 많다.
        String connectReult = client.connect();
        // 결과가 성공이 아니다 -> 오류다.
        if (!isError(connectReult)) { // ctrl + art + m으로 메서드 만들기
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectReult);
        } else {
            String sendResult = client.send(data);
            if (!isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            }
        }

        client.disconnect();
    }

    private static boolean isError(String connectReult) {
        return connectReult.equals("success");
    }
}
