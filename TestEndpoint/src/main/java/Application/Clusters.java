package Application;

/**
 * Created by manula on 11/8/14.
 */
public class Clusters {
    private Member[] member;

    private String isLbCluster;

    private String[] hostNames;

    private String tenantRange;

    private String clusterId;

    private String serviceName;

    public Member[] getMember() {
        return member;
    }

    public void setMember(Member[] member) {
        this.member = member;
    }

    public String getIsLbCluster() {
        return isLbCluster;
    }

    public void setIsLbCluster(String isLbCluster) {
        this.isLbCluster = isLbCluster;
    }

    public String[] getHostNames() {
        return hostNames;
    }

    public void setHostNames(String[] hostNames) {
        this.hostNames = hostNames;
    }

    public String getTenantRange() {
        return tenantRange;
    }

    public void setTenantRange(String tenantRange) {
        this.tenantRange = tenantRange;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
