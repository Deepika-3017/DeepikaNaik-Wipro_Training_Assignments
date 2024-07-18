import java.util.Scanner;

class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private float experience;

    public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
        super(empId, name);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
    }

    public void calculateMonthlySalary() {
        double variableComponent = 0;
        if (getExperience() < 3) {
            variableComponent = 0;
        } else if (getExperience() >= 3 && getExperience() < 5) {
            variableComponent = 0.05 * getBasicPay();
        } else if (getExperience() >= 5 && getExperience() < 10) {
            variableComponent = 0.07 * getBasicPay();
        } else if (getExperience() >= 10) {
            variableComponent = 0.12 * getBasicPay();
        }
        setSalary(getBasicPay() + getHra() + variableComponent);
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
}

class ContractEmployee extends Employee {
    private double wage;
    private float hoursWorked;

    public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
        super(empId, name);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public void calculateSalary() {
        setSalary(getHoursWorked() * getWage());
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for PermanentEmployee
        System.out.println("For PermanentEmployee:\n");
        System.out.print("Employee ID: ");
        int permEmpId = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Employee Name: ");
        String permEmpName = scanner.nextLine();
        System.out.print("Basic Pay: ");
        double basicPay = scanner.nextDouble();
        System.out.print("HRA: ");
        double hra = scanner.nextDouble();
        System.out.print("Experience: ");
        float experience = scanner.nextFloat();

        PermanentEmployee permanentEmployee = new PermanentEmployee(permEmpId, permEmpName, basicPay, hra, experience);
        permanentEmployee.calculateMonthlySalary();
        System.out.println("Hi " + permanentEmployee.getEmployeeName() + ", your salary is $" + permanentEmployee.getSalary());

        // Input for ContractEmployee
        System.out.println("For ContractEmployee: \n");
        System.out.print("Employee ID: ");
        int contractEmpId = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Employee Name: ");
        String contractEmpName = scanner.nextLine();
        System.out.print("Wage: ");
        double wage = scanner.nextDouble();
        System.out.print("Hours Worked: ");
        float hoursWorked = scanner.nextFloat();

        ContractEmployee contractEmployee = new ContractEmployee(contractEmpId, contractEmpName, wage, hoursWorked);
        contractEmployee.calculateSalary();
        System.out.println("Hi " + contractEmployee.getEmployeeName() + ", your salary is $" + contractEmployee.getSalary());

        scanner.close();
    }
}

