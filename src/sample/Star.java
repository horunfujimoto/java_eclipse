package sample;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
        System.out.print("数字を入力してください: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("☆");
            }
            System.out.println();
        }

	}

}
