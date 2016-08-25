import java.util.Scanner;
public class Modulus
	{
		public static void main(String[] args)
			{
				//exercise1();
				//exercise2();
				exercise3();
			}
		public static void exercise1()
			{
				Scanner input = new Scanner(System.in);
				System.out.println("Type a number");
				int number = input.nextInt();
				if(number%2 ==1)
					{
						System.out.println("The number is odd");
					}
				else
					{
						System.out.println("The number is even");
					}
				
			}
		public static void exercise2()
		{
			Scanner input2 = new Scanner(System.in);
			System.out.println("Type in a year");
			int year = input2.nextInt();
			if(year%4 == 0)
				{
					System.out.println("This is a leap year");
				}
			else
				{
					System.out.println("This is not a leap year");
				}
		}
		public static void exercise3()
		{
			int i = 0;
			int[] array = {2, 5, -7, 1, 3, 12, 19, -16, 4, 20};
			for (i = 0; i<array.length; i++)
				{
					if((i)%3 == 0)
						{
							System.out.println(array[i]);
						}
				}
		}
	}
