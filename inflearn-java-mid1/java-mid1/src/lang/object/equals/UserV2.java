package lang.object.equals;

import java.util.Objects;

// UserV2는 id(고객 번호)가 같으면 논리적으로 같은 객체로 정의한다.-> 동등성
public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

/*
    @Override
    public boolean equals(Object obj) {
        // obj는 상위 클래스라서 id가 없기 때문에 다운캐스팅을 한다.
        UserV2 user = (UserV2) obj;
        return id.equals(user.id);
    }
*/

    // 정확한 equals - generate로 생성하기
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }
}
