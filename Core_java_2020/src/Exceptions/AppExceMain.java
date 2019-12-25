package Exceptions;

public class AppExceMain
{
    private static int i;

    public static void main (String[] args) throws ApplicationException
    {
        try
        {
            i = 1 / 0;
            throw new ApplicationException ("aa");
        }
        catch (Exception e)
        {
            //System.out.println (e);
            // TODO: handle exception
        }
    }

}
