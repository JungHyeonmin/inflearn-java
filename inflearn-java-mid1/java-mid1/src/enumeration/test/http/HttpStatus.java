package enumeration.test.http;

public enum HttpStatus {

    // 코드 작성

    OK(200, "OK"), // HTTP 상태코드에서 200 ~ 299사이의 숫자를 성공으로 인정한다.
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private int code;
    private String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }


    // status클래스 타입에 저장된 code값을 받음
    public static HttpStatus findByCode(int code) {
        // 모든 상수들과 code값이 같은지 비교한다.
        // 1. 상수들을 비교하기 위해서 전부 배열에 넣는다.
        HttpStatus[] values = values();
        // 2. 반복문으로 같은 값이 있는지 찾기
        for (HttpStatus status : values) {
            // 만약 너가 만든 클래스타입의 code와 상수 code의 값이 같다면
            if (code == status.getCode()) {
                return status; // 너가 만든 인스턴스를 다시 반환
            }
        }
        // 아니면 null 반환
        return null;
    }


    public boolean isSuccess() {
        return 200 <= code && code <= 299;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
