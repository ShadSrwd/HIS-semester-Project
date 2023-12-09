package testhospital;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Doctor> doctors = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("\t Welcome to the Hospital Management System");
                System.out.println("\t*******************************************");
                System.out.println("1. Add a patient"+"\t2. Add an employee"+"\t3. Add a doctor");
                System.out.println("4. View all patients"+"\t5. View all employees"+"\t6. View all doctors");
                System.out.println("7. Delete a patient"+"\t8. Delete an employee"+"\t9. Delete a doctor");
                System.out.println("10. Edit patients"+"\t11. Edit employees"+"\t12. Edit doctors");
                System.out.println("13. Exit "+"\t\t14. HELP ");
                System.out.print("Enter your choice: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid option.");
                    scanner.next();
                }
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.println("\tEnter Patient Details:");
                        System.out.println("\t**********************");
                        Patient patient = new Patient("", "", "", 0, 0);
                        patient.getInput();
                        patients.add(patient);
                    }
                    case 2 -> {
                        System.out.println("\tEnter Employee Details");
                        System.out.println("\t**********************");
                        Employee employee = new Employee("", "", "", 0, 0, 0, "", 0.0, "", "");
                        employee.getInput();
                        employees.add(employee);
                    }
                    case 3 -> {
                        System.out.println("Enter Doctor Details:");
                        System.out.println("\t**********************");
                        Doctor doctor = new Doctor("", "", "", 0, 0, 0, 0.0, "", "");
                        doctor.getInput();
                        doctors.add(doctor);
                    }
                    case 4 -> {
                        System.out.println("List of all Patients:");
                        for (Patient patient : patients) {
                            patient.display();
                        }
                    }
                    case 5 -> {
                        System.out.println("List of all employees:");
                        for (Employee employee : employees) {
                            employee.display();
                        }
                    }
                    case 6 -> {
                        System.out.println("List of all doctors:");
                        for (Doctor doctor : doctors) {
                            doctor.display();
                        }
                    }
                    case 7 -> {
                        System.out.print("Enter the patient ID to delete: ");
                        int deletePatientId = scanner.nextInt();
                        scanner.nextLine();
                        boolean patientDeleted = false;
                        for (int i = 0; i < patients.size(); i++) {
                            if (patients.get(i).getPatientId() == deletePatientId) {
                                patients.remove(i);
                                patientDeleted = true;
                                break;
                            }
                        }
                        if (patientDeleted) {
                            System.out.println("Patient deleted successfully!");
                        } else {
                            System.out.println("Patient with the specified ID not found.");
                        }
                    }
                    case 8 -> {
                        System.out.print("Enter the employee ID to delete: ");
                        int deleteEmployeeId = scanner.nextInt();
                        scanner.nextLine();
                        boolean employeeDeleted = employees.removeIf(employee -> employee.getEmployeeId() == deleteEmployeeId);
                        if (employeeDeleted) {
                            System.out.println("Employee deleted successfully!");
                        } else {
                            System.out.println("Employee with the specified ID not found.");
                        }
                    }
                    case 9 -> {
                        System.out.print("Enter the doctor ID to delete: ");
                        int deleteDoctorId = scanner.nextInt();
                        scanner.nextLine();
                        boolean doctorDeleted = doctors.removeIf(doctor -> doctor.getDoctorId() == deleteDoctorId);
                        if (doctorDeleted) {
                            System.out.println("Doctor deleted successfully!");
                        } else {
                            System.out.println("Doctor with the specified ID not found.");
                        }
                    }
                    case 10 -> {
                        System.out.print("Enter the patient ID to edit: ");
                        int editPatientId = scanner.nextInt();
                        scanner.nextLine();
                        boolean patientFound = false;
                        for (Patient patient : patients) {
                            if (patient.getPatientId() == editPatientId) {
                                patient.getInput();
                                patientFound = true;
                                break;
                            }
                        }
                        if (!patientFound) {
                            System.out.println("Patient with the specified ID not found.");
                        }
                    }
                    case 11 -> {
                        System.out.print("Enter the employee ID to edit: ");
                        int editEmployeeId = scanner.nextInt();
                        scanner.nextLine();
                        boolean employeeFound = false;
                        for (Employee employee : employees) {
                            if (employee.getEmployeeId() == editEmployeeId) {
                                employee.getInput();
                                employeeFound = true;
                                break;
                            }
                        }
                        if (!employeeFound) {
                            System.out.println("Employee with the specified ID not found.");
                        }
                    }
                    case 12 -> {
                        System.out.print("Enter the doctor ID to edit: ");
                        int editDoctorId = scanner.nextInt();
                        scanner.nextLine();
                        boolean doctorFound = false;
                        for (Doctor doctor : doctors) {
                            if (doctor.getDoctorId() == editDoctorId) {
                                doctor.getInput();
                                doctorFound = true;
                                break;
                            }
                        }
                        if (!doctorFound) {
                            System.out.println("Doctor with the specified ID not found.");
                        }
                    }
                    case 13 -> System.out.println("Exiting the program...");
                    
                    
                    case 14 -> {
                        System.out.println("\tFo Any Problem in this Software Contact ");
                        System.out.println("\t***************************************");
                        System.out.println("Bryar "+"07734888293"+" \tShvan" +"07701101111"+"\tShad"+"0770111111");
                        System.out.println("Iraq - Sulaymaniyah - Tishk University Computer Engineering Department ");
                                              
                    }
                    
                    
                    default -> System.out.println("Please enter a valid option.");
                }
            } while (choice != 13);
        }
    }
}
