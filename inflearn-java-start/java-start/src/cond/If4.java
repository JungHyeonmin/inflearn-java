package cond;

public class If4 {
    public static void main(String[] args) {
        int age = 7;

        if (age <= 7) {                      // ~ 7 미취학
            System.out.println("미취학");
        } else if (8 <= age && age <= 13) {  // 8~13 초등학생
            System.out.println("초등학생");
        } else if (14 <= age && age <= 16) { // 14~16 중학생
            System.out.println("중학생");
        } else if (17 <= age && age <= 19) { // 17~19 고등학생
            System.out.println("고등학생");
        } else {                             // 20 ~ : 성인
            System.out.println("성인");
        }
    }
}
