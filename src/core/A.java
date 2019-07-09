package core;
class B{
	public void m1(){
		System.out.println("b");
	}
}
public class A extends B{
	public void m1(){
		System.out.println("a");
	}


	public static void main(String[] args) {
		
		
         new B().m1();;
	}

}
