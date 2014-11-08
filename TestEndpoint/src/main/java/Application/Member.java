package Application;

/**
 * Created by manula on 11/8/14.
 */
public class Member
{
    private String networkPartitionId;

    private String memberPublicIp;

    private String status;

    private Property[] property;

    private String memberId;

    private String partitionId;

    private String clusterId;

    private String memberIp;

    private String serviceName;

    public String getNetworkPartitionId ()
    {
        return networkPartitionId;
    }

    public void setNetworkPartitionId (String networkPartitionId)
    {
        this.networkPartitionId = networkPartitionId;
    }

    public String getMemberPublicIp ()
    {
        return memberPublicIp;
    }

    public void setMemberPublicIp (String memberPublicIp)
    {
        this.memberPublicIp = memberPublicIp;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public Property[] getProperty ()
    {
        return property;
    }

    public void setProperty (Property[] property)
    {
        this.property = property;
    }

    public String getMemberId ()
    {
        return memberId;
    }

    public void setMemberId (String memberId)
    {
        this.memberId = memberId;
    }

    public String getPartitionId ()
    {
        return partitionId;
    }

    public void setPartitionId (String partitionId)
    {
        this.partitionId = partitionId;
    }

    public String getClusterId ()
    {
        return clusterId;
    }

    public void setClusterId (String clusterId)
    {
        this.clusterId = clusterId;
    }

    public String getMemberIp ()
    {
        return memberIp;
    }

    public void setMemberIp (String memberIp)
    {
        this.memberIp = memberIp;
    }

    public String getServiceName ()
    {
        return serviceName;
    }

    public void setServiceName (String serviceName)
    {
        this.serviceName = serviceName;
    }
}
