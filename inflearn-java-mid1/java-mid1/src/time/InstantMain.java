package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain  {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now(); // UTC(협정 세계시) 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        // 다른 타입의 날짜와 시간을 기준으로 Instant를 생성한다.
        // UTC를 기준으로 하기 때문에 LocalDateTime은 사용할 수 없다.
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        // 에포크 시간으로 부터 n초를 더함
        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        // 계산 - 에포크 시간에서 초를 더한다.
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        // 조회 - 에포크 시간으로 부터 흐른 시간을 반환
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterepochSecond = " + laterEpochSecond);
    }
}
