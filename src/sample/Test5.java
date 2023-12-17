package sample;

public class Test5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = i * 5;
        }

        StringBuilder oddValues = new StringBuilder();
        for (int value : array) {
            if (value % 2 != 0) {
                if (oddValues.length() > 0) {
                    oddValues.append(", ");
                }
                oddValues.append(value);
            }
        }

        System.out.println(oddValues);

	}

}
