package patterns;

public class Pattern7 {
	public static void main(String[] args) {
		
	
	int rows=5;
	for(int i=1;i<=rows;i++){
		//for(int j=1;j<=i;j++){
			for(int j=rows;j>=i;j--){
			System.out.print("*"+" ");
			
		}
		System.out.println();
	}

}}
