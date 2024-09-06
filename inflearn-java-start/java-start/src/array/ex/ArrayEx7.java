package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // 4명의 학생의 국 수 영 점수 받기
        int[][] numbers = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요 : ");
            for (int j = 0; j < 3; j++) {
                System.out.println(subjects[j] + " 점수");
                numbers[i][j] = stdIn.nextInt();
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
            double avg = sum / 3.0;
            System.out.println(i + "번 학생의 총점 : " + sum + "평균 : " + avg);
        }
    }
}
