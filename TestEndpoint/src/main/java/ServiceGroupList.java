import java.util.ArrayList;

public class ServiceGroupList {
    private ArrayList<ServiceGroupDefinition> serviceGroupDefinition;

    public ArrayList<ServiceGroupDefinition> getServiceGroup() {
        return serviceGroupDefinition;
    }

    public void setServiceGroup(ArrayList<ServiceGroupDefinition> serviceGroup) {
        this.serviceGroupDefinition = serviceGroup;
    }

    ServiceGroupList () {
        serviceGroupDefinition = new ArrayList<ServiceGroupDefinition>();
    }
}