public class DemoInherAndAssoc {
    public static void main(String[] args) {

        // Create lecturer object
        Lecturer teacher1 = new Lecturer();

        //New list for lecturer?

        // Create student objects from abstract class
        Undergraduate under1 = new Undergraduate("Naruto", "Konoha", 14, 7384473, "Konoha Ninja School");
        Postgraduate post1 = new Postgraduate("Kakashi", "Konoha", 32, 834774837, "BEng Anbu training");

        // Add student to list of students for that lecturer
        teacher1.addStudent(Undergraduate under1);
        teacher1.addStudent(Postgraduate post1);
    }
}
