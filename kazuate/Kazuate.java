import java.util.Scanner;
import java.util.Random;

public class Kazuate {
    public static void main(String[] args) {
        Random rand = new Random();
        int answer = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("数当てゲーム開始！（1〜100）");

        do {
            System.out.print("予想した数を入力してください：");
            guess = scanner.nextInt();
            attempts++;

            if (guess < answer) {
                System.out.println("もっと大きいです。");
            } else if (guess > answer) {
                System.out.println("もっと小さいです。");
            } else {
                System.out.println("正解！ " + attempts + " 回で当たりました！");
            }
        } while (guess != answer);

        scanner.close();
    }
}
