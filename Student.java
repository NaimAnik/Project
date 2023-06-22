import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private String studentId;
    private String name;
    private List<String> results;

    public Student(String email, String password, String studentId, String name) {
        super(email, password, "student");
        this.studentId = studentId;
        this.name = name;
        this.results = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void addResult(String result) {
        results.add(result);
    }

    public void viewResults() {
        System.out.println("Results for " + name + ":");
        for (String result : results) {
            System.out.println(result);
        }
    }
}
