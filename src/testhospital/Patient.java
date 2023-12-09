package testhospital;

import java.util.Scanner;

public class Patient extends Person {
     int patientId;
     String diseaseType;
     String labResult;
     String radiologyResult;
     String pharmacy;

     public Patient(){ }
     
    public Patient(String firstName, String lastName, String address, int age, int phone) {
        super(firstName, lastName, address, age, phone);
        
        this.patientId = patientId;
        this.diseaseType = diseaseType;
        this.labResult = labResult;
        this.radiologyResult = radiologyResult;
        this.pharmacy = pharmacy;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;
    }

    public String getLabResult() {
        return labResult;
    }

    public void setLabResult(String labResult) {
        this.labResult = labResult;
    }

    public String getRadiologyResult() {
        return radiologyResult;
    }

    public void setRadiologyResult(String radiologyResult) {
        this.radiologyResult = radiologyResult;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }


    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter patient ID: ");
        this.patientId = scanner.nextInt();

        System.out.print("Enter F.Name: ");
        this.firstName = scanner.next();
        
        System.out.print("Enter L.Name: ");
        this.lastName = scanner.next();
        
        System.out.print("Enter Address: ");
        this.address = scanner.next();
        
        System.out.print("Enter Age : ");
        this.age = scanner.nextInt();
        
        System.out.print("Enter Phone : ");
        this.phone = scanner.nextInt();
        
        System.out.print("Enter disease type: ");
        this.diseaseType = scanner.next();

        System.out.print("Enter lab result: ");
        this.labResult = scanner.next();

        System.out.print("Enter radiology result: ");
        this.radiologyResult = scanner.next();

        System.out.print("Enter pharmacy: ");
        this.pharmacy = scanner.next();

       
    }


    public void display() {
        System.out.println("Patient ID: " + this.patientId);
        System.out.println("Enter F.Name: " + this.getFirstName());
        System.out.println("Enter L.Name: " + this.getLastName());
        System.out.println("Enter Address: " + this.getAddress());
        System.out.println("Enter Age: " + this.getAge());
        System.out.println("Enter Phone: " + this.getPhone());
        System.out.println("Disease Type: " + this.getDiseaseType());
        System.out.println("Lab Result: " + this.getLabResult());
        System.out.println("Radiology Result: " + this.getRadiologyResult());
        System.out.println("Pharmacy: " + this.getPharmacy());
    }
}
