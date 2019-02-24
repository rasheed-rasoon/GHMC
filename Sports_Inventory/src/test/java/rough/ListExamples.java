package rough;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
	
	public static void listEx()
	{
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("Rasheed");
		l1.add("ahmed");
		l1.add("Sheik");
		
		for(String data:l1)
		{
			
			System.out.println(data);
		}
		
		
		
	}
	

	
	public static void main(String args[])
	{
		ListExamples.listEx();
		
	}
}
