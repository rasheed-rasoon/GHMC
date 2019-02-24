package rough;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class IteratorAndListIterator {
		public static void main(String[] args) {
		List list=new ArrayList();
		list.add("rasheed");
		list.add("ahmed");
		list.add("sheik");
		

		System.out.println("list objects  using iterator interface are");
		
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		Queue queue=new PriorityQueue(list);
		
		Iterator itr2=queue.iterator();
		
		System.out.println("queue objects are");
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		
		System.out.println("set objects are");
		Set set=new HashSet(list);
		Iterator itr3=set.iterator();
		while(itr3.hasNext())
		{
			System.out.println(itr3.next());
			
		}
		
		System.out.println("objects of lsitIterator are ");
		ListIterator listItr1=list.listIterator();
		while(listItr1.hasPrevious())
		{
			System.out.println(listItr1.previous());
		}
		

				
	}

}
