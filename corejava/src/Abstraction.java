
abstract class AbstractClass
{
    abstract void abstractMethod();
   
}
 
class ConcreteClass extends AbstractClass
{
	int id1;
    void abstractMethod()
    {
        System.out.println("hkhk");
    }
    public void AbstractClass(int id){
    	id1=2;
    	System.out.println(id1);
    }
}
 
public class Abstraction
{
    public static void main(String[] args)
    {
        //AbstractClass A = new AbstractClass();  Can't create objects to Abstract class
        ConcreteClass C = new ConcreteClass();
        //ConcreteClass implements abstract method,
        //so we can create object to ConcreteClass
        AbstractClass A1 = C;
       C.AbstractClass(0);
        //ConcreteClass object is auto-upcasted to AbsractClass
    }
}