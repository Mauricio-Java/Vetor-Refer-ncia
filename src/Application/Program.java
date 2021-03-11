package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Program {

	public static void main(String[] args) {
		// Programa utilizando um vetor tipo referência

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Please, Enter Vector´s Size");
		int n = sc.nextInt();

		Product[] vector = new Product[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Please, Enter product´s name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Please, Enter product´s price");
			double price = sc.nextDouble();

			vector[i] = new Product(name, price);

		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {

			sum += vector[i].getPrice();
		}

		double avg = sum / n;

		System.out.printf("Average Price:= %.2f%n", avg);

		sc.close();
	}

}
