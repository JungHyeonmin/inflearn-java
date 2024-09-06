package enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("HTTP CODE: ");
        int httpCodeInput = scanner.nextInt();

        // HttpStatus 생성자(HTTP CODE), code를 입력해서 찾는다.
        HttpStatus status = HttpStatus.findByCode(httpCodeInput);

        if (status == null) { // 없는 값을 입력함
            System.out.println("정의되지 않은 코드");
        } else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        }
    }
}
