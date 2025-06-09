import java.util.Scanner;

public class Kazuate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 42; // プログラマが設定する2桁の数
        int attempts = 5;

        System.out.println("数あてゲーム（2桁の正の整数を当ててください）");
        System.out.println("ヒント：10~99の整数です。最大5回まで予想できます。");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("[" + i + "回目] 数字を入力してください: ");
            int guess = scanner.nextInt();

            // 入力バリデーション（2桁の正の整数）
            if (guess < 10 || guess > 99) {
                System.out.println("無効な入力です。2桁の正の整数を入力してください。");
                i--; // この試行はカウントしない
                continue;
            }

            if (guess == answer) {
                System.out.println("当たり！");
                return; // ゲーム終了
            } else {
                int diff = Math.abs(guess - answer);

                if (guess > answer) {
                    System.out.print("答えはもっと小さいです。");
                } else {
                    System.out.print("答えはもっと大きいです。");
                }

                if (diff >= 20) {
                    System.out.print("（差が大きすぎます）");
                }

                System.out.println();
            }
        }

        System.out.println("ゲームオーバー！正解は " + answer + " でした。");
        scanner.close();
    }
}
