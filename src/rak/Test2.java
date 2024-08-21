package rak;

 class Demo1 {
	static int x=100;
	static void test() {
		System.out.println("Ruuninng  main mathod");
	}

}
 public class Test2{
	 
	 public static void main(String[] args) {
		System.out.println("main method is started ");
		
		System.out.println(Demo1.x);
		Demo1.test();
		System.out.println("madifying static variable");
		Demo1.x=200;
		System.out.println("value of x :" + Demo1.x);
		System.out.println("main mrthod is ended ");;
	}
	 
 }
