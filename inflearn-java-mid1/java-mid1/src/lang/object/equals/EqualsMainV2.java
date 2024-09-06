package lang.object.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id - 001");
        UserV2 user2 = new UserV2("id - 001");

        // 참조값 - x001 == x002 -> false
        System.out.println("identity = " + (user1 == user2));
        // 내용물 - (id - 001) == (id - 001) -> true
        System.out.println("equality = " + (user1.equals(user2)));
    }

}
