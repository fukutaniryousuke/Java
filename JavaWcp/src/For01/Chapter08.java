package For01;

public class Chapter08 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 5) {
			System.out.println(number *= number);
			number++;
		}
		int[] array = { 1, 3, 5, 7 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}
