package rough;

import com.beust.jcommander.Strings;

public class TrainglePatterns {
	
	
	public static  void traingle11()
	{
		for(int i=7;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print("*");			}
			
			
		}
		System.out.println();
		
	}
	
	
	public static void main(Strings args[])
	{
		
		TrainglePatterns.traingle11();
	
}
}
