package sample;

public class Test3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sumOfEvenNumbers = 0;
        int countOfEvenNumbers = 0;

        for (int num = 2; num <= 10; num += 2) {
            sumOfEvenNumbers += num;
            countOfEvenNumbers++;
        }

        System.out.println("偶数の個数: " + countOfEvenNumbers);
        System.out.println("偶数の合計: " + sumOfEvenNumbers);

	}

}
