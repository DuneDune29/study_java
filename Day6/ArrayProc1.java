package Day6;

import java.util.Scanner;

public class ArrayProc1 {
	public void getValues(int[] array) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("������ �Է��Ͻÿ�:");
			array[i] = s.nextInt();
		}
	}

	public double getAverage(int[] array) {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total / array.length;
	}
}