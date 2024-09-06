package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        // 노란줄 -> 향상된 for문을 사용하겠는가?
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }
        double average = (double) total / 5;
        System.out.println("점수 총합 = " + total);
        System.out.println("점수 평균 = " + average);
    }
}
