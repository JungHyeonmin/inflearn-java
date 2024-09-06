package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
        // NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner stdIn = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자 : ");
            String input = stdIn.nextLine();
            if (input.equals("exit")) {
                break;
            }

            // 공통 예외처리 로직
            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    // 공통 예외처리
    private static void exceptionHandler(Exception e) {
        // 공통 처리
        System.out.println("사용자메시지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out); // 스택 트레이스 출력 - 예외가 난 과정과 위치를 제공함
        // e.printStackTrace();

        // 필요하면 예외 별도 별도의 추가 처리 기능
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSendData());
        }


    }
}
