package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(ms)로 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(ns)로 가져온다.
        long currentTimeNamo = System.nanoTime();
        System.out.println("currentTimeNamo = " + currentTimeNamo);

        // 환경변수를 읽는다. - 운영체제
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다. - 자바
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version : " + System.getProperty("java.version"));

        // 배열을 고속을 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];

        // originalArray를 0번 부터 copiedArray의 0번 부터 originalArray.length의 크기만큼 복사한다.
        // System을 이용해서 배열을 한번에 팍(for X)복사한다. -> 속도가 빠르다.
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0); // 왠만하면 사용하지 마(강제 종료는 프로그램의 에러를 발생함)
        System.out.println("hello");

    }
}
