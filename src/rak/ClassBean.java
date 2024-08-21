package rak;

public class ClassBean {
	
	public static void main(String[] args) {
		
		BeanClass b1= new BeanClass(123234,"vgdcdw",123);
		
		System.out.println("Employee ID " + b1.getId());
		
		System.out.println("Employee ID " + b1.getName());
		
		System.out.println("Employee ID " + b1.getSalary());
		
		b1.setId(65432);
		System.out.println("Employee ID " + b1.getId());
	}

}
