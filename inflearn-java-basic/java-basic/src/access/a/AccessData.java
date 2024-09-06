package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethodField 호출" + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethodField 호출" + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethodField 호출" + privateField);
    }
    
    public void innerAccess() {
        System.out.println("내부 호출");
        // private를 포함한 모든 곳에 접근 가능

        publicField = 100;
        defaultField = 200;
        privateField = 300;

        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
