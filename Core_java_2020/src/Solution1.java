import java.io.*;
import java.util.*;
public class Solution1 {
       public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int codeFromDB = scan.nextInt();
			try {
                System.out.println(EmpCode.getEnum(codeFromDB));
            } catch(IllegalArgumentException e) {
                System.out.println(e.toString());
            }
           scan.close();
       }




// complete the enum definition 
       
      /**
       *  We use the enumeration in the code in most places where we need constants. 
       *  The enum names are more readable but sometimes the actual value that we store in the database 
       *  could be numeric. If we get a numeric value from the DB, then we convert it into an enum value in Java code.
       *   This test is to do that conversion.In the code below, a Java class and an enum are given. You are required 
       *   to implement the code for the method "EmpCode getEnum(int code)" correctly such that, it returns the
       *    right enum for a given numeric code.For any invalid input, throw appropriate
       *     "Exception"Example:If the input code from DB is 10001 (numeric value),
       *      then the expected output is ASSOCIATE (enum value).Also,
       *       first you have complete the Enum definition per 
       *       the mapping below:ASSOCIATE = 10001SENIOR_ASSOCIATE = 10002MANAGER = 10003SENIOR_MANAGER = 10004
       * @author e5461053
       *
       */
public enum EmpCode { 

	ASSOCIATE(10001), SENIOR_ASSOCIATE(10002), MANAGER(10003), SENIOR_MANAGER(10004);
	
   private final int code;     
   private EmpCode(int code) {
		this.code = code;
	}
   // also implement this method properly
   public static EmpCode getEnum(int code) {
	   EmpCode code2 = null;
	   if(code == 10001){
		    code2 = EmpCode.ASSOCIATE;
	   }else if(code == 10002){
		    code2 = EmpCode.SENIOR_ASSOCIATE;
	   }else if(code == 10003){
		    code2 = EmpCode.MANAGER;
	   }else if(code == 10004){
		    code2 = EmpCode.SENIOR_MANAGER;
	   }else{
		   try {
			throw new Exception("Invalid Input");
		} catch (Exception e) {
			e.printStackTrace();
		}
		   
	   }
		return code2;
   }


    } // end of public enum EmpCode
}// end o