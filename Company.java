package task2;

public  class Company extends Student{
	public Company(int a) {
		this(20000.00f);
		System.out.println("My company employee size is" +a);
	}
	public Company(float a) {
		super(125555555l);
		System.out.println("My company value is "+a);
	}
	public Company(long a) {
		this(5000);
		System.out.println("Company name is ABCD");
		
	}

}
