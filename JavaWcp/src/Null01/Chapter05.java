package Null01;

public class Chapter05 {
	public static void main(String[] args) {
		//プリミティブ型変数
		long long1 = 123456789;
		double double1 = 5.65;
		boolean boolean1 = true;
		//プリミティブ型変数を出力
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(boolean1);
		//ラッパー型変数
		Float float1 = 0.123f;
		Integer int1 = 305;
		Character char1 = 'あ';
		//ラッパー型変数を出力
		System.out.println(float1);
		System.out.println(int1);
		System.out.println(char1);
		//要素数が5の「int」配列
		int[] number1 = new int[5];
		number1[0] = 1;
		number1[1] = 2;
		number1[2] = 3;
		number1[3] = 4;
		number1[4] = 5;
		//インデックス番号が3の値を出力
		System.out.println(number1[3]);
	}
}
