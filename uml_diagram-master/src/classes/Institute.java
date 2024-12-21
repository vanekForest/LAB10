package classes;

import java.util.ArrayList;
import java.util.List;

public class Institute {

    private String name;
    private String address;
    private List<ResearchAssociate> researchAssociates = new ArrayList<>();

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public List<ResearchAssociate> getResearchAssociates() {
        return researchAssociates;
    }

    public void setResearchAssociates(List<ResearchAssociate> researchAssociates) {
        this.researchAssociates = researchAssociates;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", researchAssociates=" + researchAssociates +
                '}';
    }

}
