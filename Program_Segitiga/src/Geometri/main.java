package Geometri;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi-sisi Segitiga: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		System.out.print("Berikan warna: ");
		String warna = input.next();

		System.out.print("Apakah Segitiga terisi (true / false)? ");
		boolean filled = input.nextBoolean();

		Segitiga segitiga = new Segitiga(side1, side2, side3, warna, filled);

		System.out.println(segitiga);
    }
}