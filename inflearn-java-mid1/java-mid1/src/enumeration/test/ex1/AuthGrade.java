package enumeration.test.ex1;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    private int level;
    private String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getLevel() {
        return level;
    }
}
