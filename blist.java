import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
ID:  dreosh
LANG: JAVA
TASK: friday
*/


public class blist{
	public static void main(String[] args) throws IOException
	{
		
		Scanner scan = new Scanner(new File("blist.in"));
		PrintWriter out = new PrintWriter(new File("blist.out"));
		
		int n = Integer.parseInt(scan.nextLine());
		int[] finTime = new int[n];
		int[] start = new int[n]; 
		int[] buckets = new int[n];
		int fillUp = 0; 
		while(fillUp<n)
		{
			start[fillUp] = Integer.parseInt(scan.next());
			finTime[fillUp] = Integer.parseInt(scan.next());
			buckets[fillUp] = Integer.parseInt(scan.next());
			fillUp++;
		}
		
		int i =1;
		int j = 0;
		int sum;
		int max = 0;
		while(i<1000)
		{
			sum = 0;
			while(j<n)
			{
				if(i>= start[j] && i<=finTime[j])
				{
					sum = sum + buckets[j];
				}
				
				j++;
			}
			if(sum>=max)
			{
				max = sum;
			}
			j=0;
			i++;
			
		}
		
		out.println(max);
		out.close();
		
		
		
	}
}