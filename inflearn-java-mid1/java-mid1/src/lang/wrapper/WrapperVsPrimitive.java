package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int itertions = 1_000_000_000; // 반복 횟수 설정, 10억
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < itertions; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간 : " + (endTime - startTime) +"ms");

        // 래퍼 클래스 Long 사용, Long은 래퍼 클래스다.
        Long sumWrapper = 0L; // 반복횟수 설정
        startTime = System.currentTimeMillis();
        for (int i = 0; i < itertions; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumWrapper);
        System.out.println("래퍼 자료형 long 실행 시간 : " + (endTime - startTime) +"ms");
    }

}
