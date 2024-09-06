package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
        // NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
        // NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
        // NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
        // NetworkServiceV2_4 networkService = new NetworkServiceV2_4();
        NetworkServiceV2_5 networkService = new NetworkServiceV2_5();

        Scanner stdIn = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자 : ");
            String input = stdIn.nextLine();
            if (input.equals("exit")) {
                break;
            }

            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
