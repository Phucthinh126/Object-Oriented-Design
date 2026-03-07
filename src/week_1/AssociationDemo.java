package week_1;

public class AssociationDemo {
    // relationShip association:
    public static void main(String[] args) {
        Student s1 = new Student(20, "s001", "Thịnh");

        Course c1 = new Course("CS101", "Java Programming");
        Course c2 = new Course("CS102", "Data Structures");

        // quan hệ 1 - N
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s1.displayCouse();

        // có thể có nhiều sinh viên và nhiều khóa học

    }
}
