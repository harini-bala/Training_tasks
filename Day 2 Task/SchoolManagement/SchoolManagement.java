
public class SchoolManagement {
    public static void main(String[] args) {
        // Creating objects
        Student student1 = new Student("Rahul", 17, "S101");
        Course course1 = new Course("Mathematics", "MTH101", 6);
        Teacher teacher1 = new Teacher("Mr. Sharma", "Mathematics", 10);

        // Displaying details using toString()
        System.out.println(student1);
        System.out.println(course1);
        System.out.println(teacher1);
    }
}