package extends1.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() { // public - 가능
        System.out.println("Parent.publicMethod");
    }

    protected void protectedMethod() { //protected - 같은 패키지만 가능(하지만 상속은 허용)
        System.out.println("Parent.protectedMethod");
    }

    void defaultMethod() { // default - 다른 패키지는 불가능
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod() { // private - 다른 클래스는 전부 불가능
        System.out.println("Parent.privateMethod");
    }

    public void printParent() { // public은 가능
        System.out.println("==Parent 메서드 안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue); //부모 메서드 안에서 접근 가능
        System.out.println("privateValue = " + privateValue); //부모 메서드 안에서 접근 가능

        //부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();
    }
}
