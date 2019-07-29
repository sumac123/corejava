package array;

import java.util.Arrays;
import java.util.HashSet;

public class MutipleMissingElemts {
	public static void main(String[] args)
	{
	int [] a1={1,2,5};
	Arrays.sort(a1);
	HashSet<Integer> hs=new HashSet<Integer>();
	int j=0;
	for(int i=1; i<6; i++)
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
	
	//another approch
int[] register=new int[a1.length];
	
	for(int i:a1) {
		register[i]=1;
	}
	
	for(int i=1; i<12;i++) {
		if(register[i]==0) {
			System.out.println(i);
		}
	}
	
	
	}
	
}
