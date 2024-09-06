package oop;

public class MusicPlayer {
    int volume;
    boolean isOn;

    void add() {
        volume++;
        System.out.println("숫자 증가 value = " + volume);
    }

    void on() { // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() { // 음악 플레이어 종료
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void up() { // 볼륨 업
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    void down() { // 볼륨 다운
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    void status() { // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

}