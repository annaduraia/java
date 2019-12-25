package otp;

//Java code to explain how to generate random 
//password 
class uniquePassword 
{ 
public static long Code() //this code returns the unique 16 digit code 
{ //creating a 16 digit code using Math.random function 
	long code =(long)((Math.random()*9*Math.pow(10,15))+Math.pow(10,15)); 
	return code; //returning the code 
} 
	//method to generate the password 
	//by converting every two digits as an ascii value of a character 
public static void main(String args[]) 
{ 
long code=Code();//function calling 
String unique_password=""; 
for (long i=code;i!=0;i/=100)//a loop extracting 2 digits from the code 
	{ 
		long digit=i%100;//extracting two digits 
		if (digit<=90) 
		digit=digit+32; 
		//converting those two digits(ascii value) to its character value 
		char ch=(char) digit; 
		// adding 32 so that our least value be a valid character 
		unique_password=ch+unique_password;//adding the character to the string 
	} 
	System.out.println("unique password ="+unique_password); 
	} 
} 
//Here we are using random() method of util 
//class in Java 
