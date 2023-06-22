import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
class Guardian extends User {
    private String guardianId;
    private String name;
    private List<Student> associatedStudents;

    public Guardian(String email, String password, String guardianId, String name) {
        super(email, password, "guardian");
        this.guardianId = guardianId;
        this.name = name;
        this.associatedStudents = new ArrayList<>();
    }

    public String getGuardianId() {
        return guardianId;
    }

    public String getName() {
        return name;
    }

    public void associateStudent(Student student) {
        associatedStudents.add(student);
    }

    public void viewAssociatedStudents() {
        System.out.println("Associated Students for " + name + ":");
        for (Student student : associatedStudents) {
            System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getName());
        }
    }
}
