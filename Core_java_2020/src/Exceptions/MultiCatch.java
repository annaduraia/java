package Exceptions;

import java.sql.Connection;

public class MultiCatch
{
    public static void main (String[] args) throws IllegalAccessException
    {
        try
        {
            int i = 1 / 0;
        }
        catch (ArithmeticException e)
        {
            System.out.println (e);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println ("IllegalArgumentException");
        }
        catch (SecurityException e)
        {
            System.out.println (e);
        }
        catch (Exception e)
        {
            System.out.println ("exc --------" + e);
        }
        finally
        {
            System.out.println (" finally anna");
            System.gc ();
        }

    }
}
