
//genericmethod
import java.util.*;
public class genericmethod2 {
	public static void main(String[] args)
	{
		Integer[] ic= {2,3,4,5,6,7};
		Character[] ch= {'a','b','c','d','e'};
				Double[] d= {2.0,3.4,1.2,3.5,6.5};
				String[] s= {"invento","aakshank","moodi","rendezvous"};
				display(ic);
				display(ch);
				display(d);
				display(s);
	}
	//generic method <T> type data 
	public static <T> void display(T[] a)
	{
		for(T b: a)
			System.out.printf( " %s ",b);
		System.out.println();
	}


}
