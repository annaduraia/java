package collectionss;

public class Student
{

    public Long   sId;
    public String sName;

    public Student (Long sId, String sName)
    {
        super ();
        this.sId = sId;
        this.sName = sName;
    }

    public Long getsId ()
    {
        return sId;
    }

    public void setsId (Long sId)
    {
        this.sId = sId;
    }

    public String getsName ()
    {
        return sName;
    }

    public void setsName (String sName)
    {
        this.sName = sName;
    }

}
