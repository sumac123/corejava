package patterns;

public class Demo {
	public static void main(String[] args) {
		int rows=3;
		int k=2*rows-2;
		
		for(int i=1;i<=rows;i++){
			
			for(int j=1;j<=k;j++){
				System.out.print(" ");
				}
			k=k-2;
			
			
			
			for(int j=1;j<=i;j++){
				System.out.print("* ");
				
			}
			System.out.println();
		
		}
		
		
		
		
	}

}
