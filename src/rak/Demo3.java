package rak;

public class Demo3 extends Demo2 {
	{
		System.out.println("Running non-Static Demo3 block ");
		}
	Demo3(){
		System.out.println("Demo3 class constructor");
	}
	static {
		System.out.println("Runngimg a Static block of Demo3");
	}

}
