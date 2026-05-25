package com.example.lld1_apr_2026.inheritance;

// Student is a specific type of User
public class Student extends User { // Student is extended version of User
    // Additional attributes for the specific student
    private String batchId;
    private int assignmentsCompleted;
    private double psp;

    public Student(String id, String username, String email) {

        super(id, username, email);
        System.out.println("DEBUG");

    }

//    public Student(String username) {
//        super();
//    }
//
//    public Student(String id, String username, String email, String batchId) {
//        // Constructor chaining
//        super(username, email); //constructor of the parent
//        this.batchId = batchId;
//        this.assignmentsCompleted = 0;
//        this.psp = 0.0;
//    }

    // ADDITIONAL Behaviours specific to this Student
    public void submitAssignment() {
        assignmentsCompleted++;
        System.out.println("total assignments submitted: " + assignmentsCompleted);
    }

    public String getBatchId() {
        return batchId;
    }

    public double getPsp() {
        return psp;
    }
}
