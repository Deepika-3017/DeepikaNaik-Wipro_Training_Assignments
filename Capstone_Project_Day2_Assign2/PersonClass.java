class Person {

	private String Name;
	private String Address;
	public String getName() {
		return Name;

	}

	public void setName(String Name) {
		this.Name = Name;

	}	public void setAddress(String address) {
		Address = address;

	}

	public String getAddress() {

		return Address;

	}

	Person(String Name, String Address) {
		this.Name = Name;
		this.Address = Address;

	}

	@Override

	public String toString() {
		return "Person [ name= " + Name + " , address= " + getAddress() + " ]";
	}
}

class Student extends Person {

	private String Program;
	private int Year;
	private double Fee;
	public Person person;

	public String getProgram() {
		return Program;
	}

	public void setProgram(String program) {
		Program = program;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public double getFee() {
		return Fee;
	}

	public void setFee(double fee) {
		Fee = fee;
	}

	Student(String Name, String Address, String Program, int Year, double Fee) {
		super(Name,Address);
		person = new Person(Name,Address);
		this.Program = Program;
		this.Year = Year;
		this.Fee = Fee;
	}

	@Override

	public String toString() {
		return "Student [ "+ person + ", Program= " + Program + ", Year= " + Year + "Fee= " + Fee + " ]";
	} 
}

class Staff extends Person {

	private String SchoolName;
	private double Pay;
	public Person person;

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public double getPay() {
		return Pay;
	}

	public void setPay(double pay) {

		Pay = pay;

	}

	public Staff(String Name, String Address, String SchoolName, double Pay) {
		super(Name, Address);
		person = new Person(Name,Address);
		this.SchoolName = SchoolName;
		this.Pay = Pay;

	}
	@Override

	public String toString() {
		return "Staff [ " + person + ", School Name= " +SchoolName+ ", Pay= " +Pay+ " ]";
	}
}

public class PersonClass {

	public static void main(String[] args) {

		Student student = new Student("Deepika", "Honnavar", "Java", 1 , 5000);
		Staff staff = new Staff("Rukmini", "Honnavar", "Srinivas Institute Of Technology", 10000);
		System.out.println(student); 
		System.out.println(staff);  

	}

}