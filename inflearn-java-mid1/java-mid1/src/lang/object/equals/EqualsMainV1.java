package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id - 001");
        UserV1 user2 = new UserV1("id - 001");

        // 참조값 - x001 == x002 -> false
        System.out.println("identity = " + (user1 == user2));
        //
        System.out.println("equality = " + (user1.equals(user2)));
        // equals는 '=='으로 비교하기 때문에 그냥 사용하면 false가 나온다.
    }

}
