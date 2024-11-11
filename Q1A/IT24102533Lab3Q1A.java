import java.util.Scanner;


public class IT24102533Lab3Q1A
{
	public static void main (String[]args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the price of 1Kg of rice: ");
		double price = scanner.nextDouble();
		
		System.out.print("Enter the number of Kg you want to buy: ");
		double kg = scanner.nextDouble();
		
		double total = (price * kg);
		
		System.out.print("The total amount is: " + total);
	}
}