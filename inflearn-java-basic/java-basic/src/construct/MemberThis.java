package construct;

// this를 생략해서 만들기
// 강사님은 요즘은 색깔로 멤버 변수를 알려주기 때문에 굳이 사용하지 않는다.
// 이름이 어쩔 수 없이 사용해야 할 때만 사용한다.
public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}
