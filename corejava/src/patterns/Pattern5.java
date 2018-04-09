package patterns;

public class Pattern5 {
	public static void main(String[] args) {
		
	
	int rows=5;
	for(int i=rows;i>=1;i--){
		for(int j=rows;j>=i;j--){
			System.out.print(j+" ");
		}
		System.out.println();
		
	}

}
}