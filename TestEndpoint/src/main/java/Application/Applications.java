package Application;

/**
 * Created by manula on 11/8/14.
 */
public class Applications
{
    private String id;

    private String tenantAdminUsername;

    private String tenantDomain;

    private Groups groups;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTenantAdminUsername ()
    {
        return tenantAdminUsername;
    }

    public void setTenantAdminUsername (String tenantAdminUsername)
    {
        this.tenantAdminUsername = tenantAdminUsername;
    }

    public String getTenantDomain ()
    {
        return tenantDomain;
    }

    public void setTenantDomain (String tenantDomain)
    {
        this.tenantDomain = tenantDomain;
    }

    public Groups getGroups ()
    {
        return groups;
    }

    public void setGroups (Groups groups)
    {
        this.groups = groups;
    }
}
