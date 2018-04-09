package patterns;

public class Pattern6 {
	public static void main(String[] args) {
		int rows=6;
		for(int i=rows;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
