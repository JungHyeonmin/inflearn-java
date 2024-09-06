package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // dataA의 참조값 대입

        System.out.println("dataA 참조값 = " + dataA); // dataA 참조값
        System.out.println("dataB 참조값 = " + dataB); // dataA 참조값
        System.out.println("dataA.value = " + dataA.value);  // 10
        System.out.println("dataB.value = " + dataB.value);  // 10

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");          // 20
        System.out.println("dataA.value = " + dataA.value);  // 20
        System.out.println("dataB.value = " + dataB.value);  // 20

        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");          // 30
        System.out.println("dataA.value = " + dataA.value);  // 30
        System.out.println("dataB.value = " + dataB.value);  // 30

        // dataA와 dataB가 같은 참조값을 가지기 때문에 결과가 공유된다.
        System.out.println(dataA.equals(dataB));
        System.out.println("dataA의 참조값 : " + dataA);
        System.out.println("dataB의 참조값 : " + dataB);
    }
}
