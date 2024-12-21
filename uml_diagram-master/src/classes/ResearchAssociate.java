package classes;

import java.util.List;

public class ResearchAssociate extends Employee {

    private String researchArea;
    private List<Project> projects;

    public ResearchAssociate(int socialSecurityNumber, String name, String email, String researchArea) {
        super(socialSecurityNumber, name, email);
        this.researchArea = researchArea;
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public String getResearchArea() {
        return this.researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

}
