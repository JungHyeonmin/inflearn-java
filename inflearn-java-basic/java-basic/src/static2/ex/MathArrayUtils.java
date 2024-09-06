package static2.ex;

public class MathArrayUtils {

    public static int sum(int[] array) {
        int total = 0;
        for (int i : array) {
            total += i;
        }
        return total;
    }

    public static int average(int[] array) {
        return sum(array) / array.length;
    }

    public static int min(int[] array) {
        int minNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minNum > array[i])
                minNum = array[i];
        }
        return minNum;
    }

    public static int max(int[] array) {
        int maxNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxNum < array[i])
                maxNum = array[i];
        }
        return maxNum;
    }

}

