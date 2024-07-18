import java.util.Scanner;

public class Employee {

	private int ID;
	private String FirstName;
	private String LastName;
	private int Salary;

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int Salary) {
		this.Salary = Salary;
	}

	Employee(int ID, String FirstName, String LastName, int Salary){
		this.ID=ID;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Salary=Salary;
	}

	public void getName() {
		String Name = FirstName+ " " + LastName;
		System.out.println("Name= " +Name);
	}

	public void getAnnualSalary() {
		int as = Salary*12;
		System.out.println("Annual Salary= " +as);
	}

	public void getRaiseSalary(double percent) {
		double rs = Salary*12*percent;
		System.out.println("New Salary= " +rs);
	}

	public String toString() {
		return "Employee [ID = " + ID + " , Name =" +FirstName + " " + LastName + ",Salary = " +Salary +"]";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Employee ID");
		int id = sc.nextInt();
		System.out.println("Enter Employee FirstName");
		String fn = sc.next();
		System.out.println("Enter Employee LastName");
		String ln = sc.next();
		System.out.println("Enter Employee Salary");
		int s = sc.nextInt();
		Employee emp = new Employee(id,fn,ln,s);
		System.out.println(emp);
		emp.getName();
		emp.getAnnualSalary();
		emp.getRaiseSalary(0.15);
	}

}