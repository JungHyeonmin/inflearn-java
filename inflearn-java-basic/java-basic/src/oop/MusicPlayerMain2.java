package oop;

// 절차 지향 프로그래밍에서 객체지향으로 바꾸기 1 - 데이터 묶음

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        data.value = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
        //볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (data.value) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
        // 음악 플레이어 끄기
        data.value = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
