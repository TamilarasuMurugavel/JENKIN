package task2;

public  class Employee extends Company {
	public Employee(int a) {
		this("tamil");
		System.out.println("Employee id is "+1234);
		
	}
	public Employee(String b) {
		super(1234l);
		System.out.println("Employee name is "+b);
		
	}
	
	public Employee() {
		this(5655);
		System.out.println("Employee is very good");
		
	}
public static void main(String[] args) {
	Employee a=new Employee();
	
	
	
}
}
