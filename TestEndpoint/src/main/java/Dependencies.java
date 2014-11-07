/**
 * Created by manula on 11/7/14.
 */
public class Dependencies
{
    private String terminationBehaviour;

    private String[] startupOrders;

    public String getTerminationBehaviour ()
    {
        return terminationBehaviour;
    }

    public void setTerminationBehaviour (String terminationBehaviour)
    {
        this.terminationBehaviour = terminationBehaviour;
    }

    public String[] getStartupOrders ()
    {
        return startupOrders;
    }

    public void setStartupOrders (String[] startupOrders)
    {
        this.startupOrders = startupOrders;
    }
}