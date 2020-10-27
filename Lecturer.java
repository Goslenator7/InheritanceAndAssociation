import javax.swing.*;
import java.util.ArrayList;

public class Lecturer {

    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void studentsAsString() {
        String output;

        output = "Lecturer: "+getName()+" teaches:\n";

        for (Student tempStudent : this.students) {
            output = output +"\n"+tempStudent.getDetails();
        }

        JOptionPane.showMessageDialog(null, output, "Details", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
