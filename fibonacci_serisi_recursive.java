package fibonacci_serisi_recursive;

import java.util.Scanner;

public class fibonacci_serisi_recursive {

	static int fib(int n) {

		if (n == 1 || n == 2) {
			return 1;
		}

		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Kümenin kaçıncı elemanını öğrenmek istiyorsunuz: ");
		int sayi = scan.nextInt();
		
		System.out.println(fib(sayi));
	}

}
