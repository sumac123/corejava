package serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo implements Serializable {
	//int i=10;
	//int j=20;
	private static final long serialVersionUID=124545485;
	public static void main(String[] args) throws Exception {
		Demo d=new Demo();
	
		/*FileOutputStream fout=new FileOutputStream("D://Demo.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(d);
		out.flush();
		System.out.println("success");*/
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("Demo.txt"));  
		  Demo s=(Demo)in.readObject();  
		  System.out.println(s);  
	}

}
