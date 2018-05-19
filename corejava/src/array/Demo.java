package array;

import java.util.Arrays;
import java.util.HashSet;

public class Demo {
	public static void main(String[] args)
	{
	int [] a1={1,2,5,7,6};
	Arrays.sort(a1);
	HashSet<Integer> hs=new HashSet<Integer>();
	int j=0;
	for(int i=1; i<10; i++)
	{
	if (j<a1.length && i==a1[j])
	{
	j++;
	}
	else
	{
	hs.add(i);
	}
	}
	System.out.println(hs);
	}
}
