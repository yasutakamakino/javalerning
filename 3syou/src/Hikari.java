/**
 * 問題3-1 光が1日に進む距離を計算するプログラム
 */
public class Hikari {
    public static void main(String[] args) {
        long time = 24 * 60 * 60;                                                                                       // 一日の時間を秒単位にする
        long kyori = 300000 * time;                                                                                     // 距離の計算
        System.out.println("光が1日に進む距離は" + kyori + "kmです");                                                   //結果表示
    }
}

