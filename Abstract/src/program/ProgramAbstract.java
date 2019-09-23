package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class ProgramAbstract {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers:");
		int n = sc.nextInt();
		
		for (int i = 1; i<n;i++) {
			System.out.println("Tax payer #"+i+ " data:");
			System.out.println("Individual or company (i/c)?");
			char c = sc.next().charAt(0);
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anual income:");
			Double income = sc.nextDouble();
			if(c =='i') {
				System.out.println("Health expenditures:");
				Double expenditure = sc.nextDouble();
				list.add(new Individual(name, income, expenditure));
			}
			else
			{
				System.out.println("Number of employees:");
				int employeeNumber = sc.nextInt();
				list.add(new Company(name, income, employeeNumber));
			}
		}
		
		System.out.println("TAXES PAID:");
		Double total = 0.0;
		for (TaxPayer p: list ) {
			System.out.println(p.getName() + " $" + p.tax());
			total += p.tax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: %.2f", total);
		sc.close();

	}

}
