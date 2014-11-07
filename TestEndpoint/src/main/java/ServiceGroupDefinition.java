/**
 * Created by manula on 11/7/14.
 */
public class ServiceGroupDefinition
{
    private Dependencies dependencies;

    private String name;

    private String[] subGroups;

    private String[] cartridges;

    public Dependencies getDependencies ()
    {
        return dependencies;
    }

    public void setDependencies (Dependencies dependencies)
    {
        this.dependencies = dependencies;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String[] getSubGroups ()
    {
        return subGroups;
    }

    public void setSubGroups (String[] subGroups)
    {
        this.subGroups = subGroups;
    }

    public String[] getCartridges ()
    {
        return cartridges;
    }

    public void setCartridges (String[] cartridges)
    {
        this.cartridges = cartridges;
    }
}
