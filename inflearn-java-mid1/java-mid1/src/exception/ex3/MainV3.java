package exception.ex3;

import exception.ex3.NetworkServiceV3_1;
import exception.ex3.exception.NetworkClientExceptionV3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) throws NetworkClientExceptionV3 {
        // NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
        NetworkServiceV3_2 networkService = new NetworkServiceV3_2();

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
