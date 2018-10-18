public class Student {
    private String studentName;
    private String studentID;
    private double studentGPA;

    // Constructors

    public Student() {
        studentName = "";
        studentID = "";
        studentGPA = 0.0f;
    }

    public Student(String studentName, String studentID, double studentGPA) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentGPA = studentGPA;
    }

    // Accessors 

    public String getStudentName() {
        return studentName();
    }
    public String getStudentID() {
        return studentID;
    }
    public double getStudentGPA() {
        return studentGPA;
    }

    // Mutators 

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
    }

    
}   