package exception.ex2;

public class NetworkClientV2 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public String connect() throws NetworkClientExceptionV2 {
        // 연결 실패
        if (connectError) {
            //throw는 예외 생성 -> catch를 안하니까 밖으로 던진다(throws)
            // 중간에 다른 예외가 발생했다고 가정
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결  실패");
        }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) throws NetworkClientExceptionV2 {
        // 전송  실패
        if (sendError) {
            // 중간에 다른 예외가 발생했다고 가정
            throw new NetworkClientExceptionV2("sendError", address + "서버에 데이터 전송 실패");
            // throw new RuntimeException("ex");
        }


        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송 : " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + "서버 연결 해제");
    }

    public void initError(String data) {

        if (data.contains("error1")) {
            connectError = true;
        }

        if (data.contains("error2")) {
            sendError = true;
        }
    }
}