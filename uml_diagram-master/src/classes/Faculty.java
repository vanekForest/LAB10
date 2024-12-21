package classes;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

    private String name;
    private Employee dean;
    private List<Institute> institutes = new ArrayList<>();

    public Faculty(String name, Employee dean) {
        this.name = name;
        this.dean = dean;
    }

    public void addInstitute(Institute institute) {
        institutes.add(institute);
    }

    public String getName() {
        return this.name;
    }

    public Employee getDean() {
        return this.dean;
    }

    public List<Institute> getInstitutes() {
        return this.institutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDean(Employee dean) {
        this.dean = dean;
    }

    public void setInstitutes(List<Institute> institutes) {
        this.institutes = institutes;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", dean=" + dean +
                ", institutes=" + institutes +
                '}';
    }
}
