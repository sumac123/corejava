 package patterns;

public class Pattern11 {
	public static void main(String[] args) {
		int i,j;
		int rows=3;
		int num=1;
		int k=2*rows-2;
		for(i=1;i<=rows;i++){
			
			for(j=1;j<=k;j++){
				System.out.print(" ");
			}
			k=k-2;
			
			for(j=1;j<=i;j++){
				System.out.print(num+" ");
				num=num+1;
			}
			
			System.out.println();
			
		}
		
	}

}
