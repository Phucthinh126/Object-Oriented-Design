package week_1;

import java.util.ArrayList;

public class Institute {
    private String instituteName;
    private ArrayList<DeparmentDemo> listDeparmet;

    public Institute(String instituteName) {
        this.instituteName = instituteName;
        this.listDeparmet = new ArrayList<>();
    }

    public void addDepartment(DeparmentDemo department) {
        listDeparmet.add(department);
    }

    public int getTotalStudent() {
        int total = 0;
        for (DeparmentDemo deparment : listDeparmet) {
            ArrayList<Student> listStudent = deparment.getListStudent();
            for (Student student : listStudent) {
                total++;
            }
        }
        return total;
    }
}



