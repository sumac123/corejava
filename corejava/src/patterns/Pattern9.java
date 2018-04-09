package patterns;

public class Pattern9 {
	public static void main(String[] args) {
		int num=1;
		int rows=6;
		for(int i=1;i<=rows;i++){
			//num=1;
			//int num=i;
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num=num+1;
			}
			System.out.println();
		}
		
	}

}
