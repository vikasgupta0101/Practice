package rak;

public class Chaning3  extends Chaning2 {
	int id;
	double Salary;
	String designation;
	public Chaning3(String name, int age, char gender, int rollno, double markes, String colledege, int id,
			double salary, String designation) {
		super(name, age, gender, rollno, markes, colledege);
		this.id = id;
		this.Salary = salary;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Chaning3 [id=" + id + ", Salary=" + Salary + ", designation=" + designation + ", rollno=" + rollno
				+ ", markes=" + markes + ", colledege=" + colledege + ", name=" + name + ", age=" + age + ", gender="
				+ gender + "]";
	}

}
