import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Skriv två tal");
		Scanner scan = new Scanner(System.in);
		double nbr1 = scan.nextDouble();
		double nbr2 = scan.nextDouble();
		double sum = nbr1 + nbr2;
		double skillnad = nbr1 - nbr2;
		double pro = nbr1 * nbr2;
		double kvot = nbr1 / nbr2;
		System.out.println("Summan av talen är " + sum);
		System.out.println("Skillnaden mellan talen är " + skillnad);
		System.out.println("Produkten av talen " + pro);
		System.out.println("Kvoten mellan talen " + kvot);
		

	}
}
