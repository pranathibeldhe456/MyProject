package oop;

public class Student extends User {
    static String PREFIX = "scaler-";
    private String batchName;
    private Integer PSP;
    private Integer rollNumber;

    Status status = Status.ACTIVE;

    public Student(Integer id, String name, String email, String batchName,Integer PSP) {
        super(id, name, email);
        if (PSP < 0 || PSP > 100) throw new RuntimeException("PSP should be between 0 and 100");
        this.batchName = batchName;
        this.PSP = PSP;
        this.status = Status.ACTIVE;
        System.out.println("Hi" + super.getName() + "We have assigned you to" + this.batchName + " your status is" + this.status);
    }

    public void changeStatus(String Name, String batchName, Status status) {
        this.status = status;
        System.out.println("sttaus is modified to " + this.status);
    }

    public String generateRollNumber() {
        return PREFIX + batchName + super.getId();
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}