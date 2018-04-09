package patterns;

public class Pattern13 {
	public static void main(String[] args) {
		int rows=5;
		int num=1;
		
		for(int i=1;i<=rows;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num=num+1;
			}
			System.out.println();
		}
		num=num-6;
		
		for(int i=rows-1;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num=num-1;
			}
			System.out.println();
		}
	
	
	}

}
