package Application;

/**
 * Created by manula on 11/8/14.
 */
public class SubGroups
{
    private String deploymentPolicy;

    private Clusters clusters;

    private String alias;

    private String autoScalingPolicy;

    public String getDeploymentPolicy ()
    {
        return deploymentPolicy;
    }

    public void setDeploymentPolicy (String deploymentPolicy)
    {
        this.deploymentPolicy = deploymentPolicy;
    }

    public Clusters getClusters ()
    {
        return clusters;
    }

    public void setClusters (Clusters clusters)
    {
        this.clusters = clusters;
    }

    public String getAlias ()
    {
        return alias;
    }

    public void setAlias (String alias)
    {
        this.alias = alias;
    }

    public String getAutoScalingPolicy ()
    {
        return autoScalingPolicy;
    }

    public void setAutoScalingPolicy (String autoScalingPolicy)
    {
        this.autoScalingPolicy = autoScalingPolicy;
    }
}
