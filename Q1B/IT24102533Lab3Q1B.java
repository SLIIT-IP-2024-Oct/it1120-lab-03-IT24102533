import java.util.Scanner;


public class IT24102533Lab3Q1B
{
	public static void main (String[]args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the price of 1Kg of rice: ");
		double price = scanner.nextDouble();
		
		System.out.print("Enter the number of Kg you want to buy: ");
		double kg = scanner.nextDouble();
		
		double total = (price * kg);
		double discount = (total * 0.10);
		double ftotal = (total - discount);
		
		
		System.out.print("The total amount with 10% discount is: " + ftotal);
	}
}