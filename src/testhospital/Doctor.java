package testhospital;

import java.util.Scanner;

public class Doctor extends Person {
    private int doctorId;
    private double salary;
    private String specialist;
    private String department;

    public Doctor(String firstName, String lastName, String address, int age, int phone, int doctorId, double salary, String specialist, String department) {
        super(firstName, lastName, address, age, phone);
        this.doctorId = doctorId;
        this.salary = salary;
        this.specialist = specialist;
        this.department = department;
    }


    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public void getInput() {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter doctor ID: ");
        this.doctorId = scanner.nextInt();
        
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

        System.out.print("Enter salary: ");
        this.salary = scanner.nextDouble();

        System.out.print("Enter specialist: ");
        this.specialist = scanner.next();

        System.out.print("Enter department: ");
        this.department = scanner.next();

       
    }


    public void display() {
        
        System.out.println("----------------------------------");
        System.out.println("Doctor ID: " + this.doctorId);
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Address: " + this.getAddress());
        System.out.println("Age: " + this.getAge());
        System.out.println("Phone Number: " + this.getPhone());
        System.out.println("Specialist: " + this.getSpecialist());
        System.out.println("Salary: $" + this.getSalary());
        System.out.println("Department: " + this.getDepartment());
        System.out.println("----------------------------------");
    }
   
}
