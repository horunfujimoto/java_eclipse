package sample;

public class Test6 {

	public static void main(String[] args) {
		// 要素数20の配列を宣言
        int[] array = new int[20];

        // 配列の要素に0から5ずつ加算して代入
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
        }

        // 奇数のみカンマ区切りで表示
        for (int i = 0; i < array.length; i++) {
            // 奇数の場合のみ表示
            if (array[i] % 2 != 0) {
                // カンマ区切りで値を表示
                System.out.print(array[i]);

                // 最後の要素でなければカンマを追加
                if (i < array.length - 2) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();  // 改行を出力
	}

}
