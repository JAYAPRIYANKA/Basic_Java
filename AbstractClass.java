package handson;

public class AbstractClass extends two {

void method1() {
		
		 System.out.println("am from abstract class and method");
	}
		
static void method2()
{
	System.out.println("Am a concrete method");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    AbstractClass ac=new AbstractClass();
    ac.method1(); 
	method2();
	}	

}	abstract class two {
		
		abstract void method1();
		
	}
