package array;

public class ArrayDi0 {
    public static void main(String[] args) {
        // 2x3 2차우너 배열을 만든다.
        int[][] arr = new int[2][3]; // 행2, 열3

        arr[0][0] = 1; // 0행, 0열
        arr[0][1] = 1; // 0행, 1열
        arr[0][2] = 1; // 0행, 2열

        arr[1][0] = 1; // 1행, 0열
        arr[1][1] = 1; // 1행, 1열
        arr[1][2] = 1; // 1행, 2열

        // 0행 출력
        System.out.println(arr[0][0] + "  ");
        System.out.println(arr[0][1] + "  ");
        System.out.println(arr[0][2] + "  ");
        System.out.println();
        // 1행 출력
        System.out.println(arr[0][0] + "  ");
        System.out.println(arr[1][1] + "  ");
        System.out.println(arr[1][2] + "  ");
    }
}
