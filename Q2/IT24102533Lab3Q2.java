import java.util.Scanner;

public class IT24102533Lab3Q2
{	
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Enter monthly salary: ");
		double salary = scanner.nextDouble();

		System.out.print("Enter the number of OT hours: ");
		double OT_hours = scanner.nextDouble();

		System.out.print("Enter OT hourly rate: ");
		double OT = scanner.nextDouble();

			
		double OT_amount = (OT * OT_hours);
		double totalSalary = salary + OT_amount;

		System.out.print("The total salary including OT is: " + totalSalary);
	}
}