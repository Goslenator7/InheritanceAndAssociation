public class DemoInherAndAssoc {
    public static void main(String[] args) {

        Lecturer teacher1 = new Lecturer();

        Undergraduate under1 = new Undergraduate("Naruto", "Konoha", 14, 7384473, "Konoha Ninja School");
        Postgraduate post1 = new Postgraduate("Kakashi", "Konoha", 32, 834774837, "BEng Anbu training");

        teacher1.addStudent(Undergraduate under1);
        teacher1.addStudent(Postgraduate post1);
    }
}
