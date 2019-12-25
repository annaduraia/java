package collectionss;

public class Employee
{

    public Long   eId;
    public String eName;

    public Long geteId ()
    {
        return eId;
    }

    public void seteId (Long eId)
    {
        this.eId = eId;
    }

    public String geteName ()
    {
        return eName;
    }

    public Employee (Long eId, String eName)
    {
        super ();
        this.eId = eId;
        this.eName = eName;
    }

    public void seteName (String eName)
    {
        this.eName = eName;
    }

}
