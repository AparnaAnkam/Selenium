
public class Pattern1
{
	public static void main(String[] args)
	{
		int lines=5;
		int starcount=1;
		String star="*";
		System.out.println("Program Started");
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=starcount;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			starcount++;
		}
	System.out.println("Program Ended");
	}
}
