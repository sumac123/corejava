package oops;

public class OverrideDemo {
	public static void main(String[] args) {
		 int aj=65;
		for(int i=4;i>=1;i--){
			
			for(int  k=4;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print((char)aj);
				aj++;
			}
			
			
			for(int j=i;j>1;j--){
				System.out.print((char)(aj-2));
				aj--;
			}
			aj=65;
			System.out.println();
			
		}

	}
	    }

