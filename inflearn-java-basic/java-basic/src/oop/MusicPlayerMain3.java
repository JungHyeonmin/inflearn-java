package oop;

// 절차 지향 프로그래밍에서 객체지향으로 바꾸기 2 - 메서드 추출

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);

        //볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        volumeStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data) { // 음악 플레이어 켜기
        data.value = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) { // 음악 플레이어 종료
        data.value = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) { // 볼륨 업
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) { // 볼륨 다운
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void volumeStatus(MusicPlayerData data) { // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (data.value) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
