package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        Construct member1 = new Construct("user1", 15, 90);
        Construct member2 = new Construct("user2", 16);
        Construct member3 = new Construct();

        Construct[] members = {member1, member2};

        for (Construct s : members) {
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
    }
}
