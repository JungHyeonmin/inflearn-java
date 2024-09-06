package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        AuthGrade[] grades = AuthGrade.values();

        System.out.print("당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN] " + ": ");
        String level = stdIn.nextLine();

        System.out.println("당신의 등급은 " + AuthGrade.valueOf(level) + "입니다.");

        System.out.println("==메뉴 목록==");
        switch (AuthGrade.valueOf(level)) {
            case AuthGrade.GUEST:
                System.out.println("- 메인 화면");
                break;
            case AuthGrade.LOGIN:
                System.out.println("- 메인 화면");
                System.out.println("- 이메일 관리 화면");
                break;
            case AuthGrade.ADMIN:
                System.out.println("- 메인 화면");
                System.out.println("- 이메일 관리 화면");
                System.out.println("- 관리자 화면");
                break;
            default:
                break;
        }
    }
}
