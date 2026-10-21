package by.shop.task4.exception;

public class StudentNotFoundException extends Exception {
    private final String studentName;

    public StudentNotFoundException(String message, String studentName) {
        super(message);
        this.studentName = studentName;
    }

    public String getStudentName() { return studentName; }
}

