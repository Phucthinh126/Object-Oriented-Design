package week_1;

public class AggregationDemo {
    public static void main(String[] args) {
        // Creating independent Student objects
        Student s1 = new Student(22, "01", "Anh Nam");
        Student s2 = new Student(22, "02", "Vinh Hoa");
        Student s3 = new Student(22, "03", "My Khanh");
        Student s4 = new Student(22, "04", "Thinh Huynh");

        // Creating Department object with a Students list
        // using Aggregation (Department "has" students)

        DeparmentDemo sec = new DeparmentDemo("SEC");
        sec.addStudent(s1);
        sec.addStudent(s2);

        DeparmentDemo ev = new DeparmentDemo("EV");
        ev.addStudent(s4);
        ev.addStudent(s3);

        // Creating an Institute object with Departments list
        // using Aggregation (Institute "has" Departments)
        Institute ins = new Institute("VBDD");
        ins.addDepartment(sec);
        ins.addDepartment(ev);

        System.out.println("Total student: " + ins.getTotalStudent());

    }
}
