import java.util.Scanner;

class Assignment1 {

 private String teacherName;

 private String subject;

 private double salary;

 public Assignment1(String teacherName, String subject, double salary) {

     this.teacherName = teacherName;

     this.subject = subject;

     this.salary = salary;

 }

 public String getTeacherName() {

     return teacherName;

 }
 
 public void setTeacherName(String teacherName) {

     this.teacherName = teacherName;

 }

 public String getSubject() {

     return subject;

 }

 public void setSubject(String subject) {

     this.subject = subject;

 }

 public double getSalary() {

     return salary;

 }

 public void setSalary(double salary) {

     this.salary = salary;

 }

}

public class Assignment1Imp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");

        int numTeachers = scanner.nextInt();

        scanner.nextLine(); 
        
        Assignment1[] teachers = new Assignment1[numTeachers];

        for (int i = 0; i < teachers.length; i++) {

            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");
            
            System.out.print("Name: ");

            String name = scanner.nextLine();

            System.out.print("Subject: ");

            String subject = scanner.nextLine();
            
            System.out.print("Salary: ");

            double salary = scanner.nextDouble();

            scanner.nextLine();
            
            teachers[i] = new Assignment1(name, subject, salary);

        }

        System.out.println("\nDetails of Teachers:");

        for (Assignment1 teacher : teachers) {

            System.out.println("Name: " + teacher.getTeacherName() +

                    ", Subject: " + teacher.getSubject() +

                    ", Salary: " + teacher.getSalary());

        }

        scanner.close(); 

    }

}
