package exception.basic.unchecked;

public class Client {
    public void call() {
        // throws를 하지 않았는데 오류가 발생하지 않는다. 알아서 던진다.
        throw new MyUncheckedException("ex");
    }
}
