package testhospital;

import java.util.Scanner;

public class Employee extends Person {
     int employeeId;
     String jobTitle;
     double salary;
     String department;
     String image;

    public Employee(String firstName, String lastName, String address, int age, int phone, int employeeId, String jobTitle, double salary, String department, String image) {
        super(firstName, lastName, address, age, phone);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.department = department;
        this.image = image;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        this.employeeId = scanner.nextInt();

        System.out.println("Enter First Name: ");
        this.setFirstName(scanner.next());

        System.out.println("Enter Last Name: ");
        this.setLastName(scanner.next());

        System.out.println("Enter Address: ");
        this.setAddress(scanner.next());

        System.out.println("Enter Age: ");
        this.setAge(scanner.nextInt());

        System.out.println("Enter Phone Number: ");
        this.setPhone(scanner.nextInt());

        System.out.println("Enter Job Title: ");
        this.jobTitle = scanner.next();

        System.out.println("Enter Salary: ");
        this.salary = scanner.nextDouble();

        System.out.println("Enter Department: ");
        this.department = scanner.next();

        System.out.println("Enter Image: ");
        this.image = scanner.next();

      
    }


    public void display() {
        System.out.println("----------------------------------");
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Address: " + this.getAddress());
        System.out.println("Age: " + this.getAge());
        System.out.println("Phone Number: " + this.getPhone());
        System.out.println("Job Title: " + this.getJobTitle());
        System.out.println("Salary: $" + this.getSalary());
        System.out.println("Department: " + this.getDepartment());
        System.out.println("Image: " + this.getImage());
        System.out.println("----------------------------------");
    }
}
