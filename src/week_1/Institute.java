package week_1;

import java.util.ArrayList;

public class Institute {
    private String instituteName;
    private ArrayList<Deparment> listDeparmet;

    public Institute(String instituteName) {
        this.instituteName = instituteName;
        this.listDeparmet = new ArrayList<>();
    }

    public void addDepartment(Deparment department) {
        listDeparmet.add(department);
    }

    public int getTotalStudent() {
        int total = 0;
        for (Deparment deparment : listDeparmet) {
            ArrayList<Student> listStudent = deparment.getListStudent();
            for (Student student : listStudent) {
                total++;
            }
        }
        return total;
    }
}



