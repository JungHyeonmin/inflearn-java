package nested.nested.ex2;

public class Network {

    public void sendMessage(String text) {
        // 생성자로 중첩 클래스의 객체를 만들어서 사용
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    private static class NetworkMessage { // private 객체 생성 방지 -> "내부에서만 사옹하겠다."
        private String content;


        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
