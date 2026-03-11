package week_1;

import java.util.ArrayList;

public class Deparment {
    private String depName;
    private ArrayList<Student> listStudent;

    public Deparment(String depName) {
        this.depName = depName;
        this.listStudent = new ArrayList<>();
    }

    public void addStudent(Student student){
        listStudent.add(student);
    }

    public String getDepName() {
        return depName;
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }
}
