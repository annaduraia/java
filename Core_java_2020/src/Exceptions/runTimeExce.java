package Exceptions;

public class runTimeExce
{
    public static void main (String[] args)
    {
        try
        {
            disp ();
            System.out.println ("Main");
        }
        catch (RuntimeException e)
        {
            System.out.println ("Run");
        }
        catch (Exception e)
        {
            System.out.println ("Exce");
        }
        finally
        {
            System.out.println ("F");
        }
    }

    public static void disp ()
    {
        throw new RuntimeException ();
    }
}
