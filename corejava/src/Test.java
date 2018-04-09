class A{
	private void myMethod(){
		System.out.println("private");
	}
}


public class Test extends A{
	
	private void myMethod(){
		System.out.println("private method");
		
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.myMethod();
		
	}
}
