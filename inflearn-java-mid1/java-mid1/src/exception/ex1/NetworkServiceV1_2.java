package exception.ex1;


import java.sql.SQLOutput;

// 복잡한 NetworkClient사용 로직을 처리한다.
public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data); // 추가

        String connectReult = client.connect();
        // 결과가 성공이 아니다 -> 오류다.
        if (!isError(connectReult)) { // ctrl + art + m으로 메서드 만들기
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectReult);
            return;
        }


        String sendResult = client.send(data);
        if (!isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            return;
        }

        client.disconnect();
    }

    private static boolean isError(String connectReult) {
        return connectReult.equals("success");
    }
}
