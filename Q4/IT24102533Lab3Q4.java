import java.util.Scanner;

public class IT24102533Lab3Q4
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter 5 digit number: ");
		int num = scanner.nextInt();

		if(num > 10000 && num <= 99999);
		{
			int D1 = num / 10000;
			int D2 = num / 1000 % 10;
			int D3 = num / 100 % 10;
			int D4 = num / 10 % 10;
			int D5 = num / 1 % 10;
			
			System.out.println(D1 + " " + D2 + " " + D3 + " " + D4 + " " + D5 + " ");
		}
		
	}
}
			