package rak;

public class BeanClass {
	
	private int Id;
	private String name;
	private int salary;
	
	BeanClass(int ID,String name,int salary){
		this.Id=ID;
		this.name=name;
		this.salary=salary;
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
