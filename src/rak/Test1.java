package rak;

 class Demo1 {
	static int x=10;
	
	static void test() {
	 System.out.println( "test method");
	}

}
class  Test1{
	
	public static void main(String[] args) {
		
		System.out.println("main method Started");
		
		System.out.println("x Value is " + Demo1.x);
		Demo1.test();
		System.out.println("main method enended ");
	}
}