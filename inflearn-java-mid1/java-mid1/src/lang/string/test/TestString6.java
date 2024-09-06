package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        // 코드 작성 - 내가 작성한 코드 - indexOf 응용
        
        String[] strs = str.split(key);

        for (String s : strs) {
            System.out.println("s = " + s);
        }
        System.out.println("count = " + (strs.length - 1));

        // 코드 작성 - 강사님이 작성한 코드

        int count = 0;
        int index = str.indexOf(key); // 처음 발견된 곳부터 시작

        while (index >= 0) {
            // 문자열이 처음 등장하는 위치를 반환
            index = str.indexOf(key, index + 1); // 다음으로 넘어가기
            count++;
        }

        System.out.println("t count : " + count);
    }

}
