package RegularExpression;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;

public class ValidatorUtillTestCase {

    private static Pattern pattern;
    private static Matcher matcher;

    /**
     * password Whole combination is means, 6 to 20 characters string with at
     * least one digit, one upper case letter, one lower case letter and one
     * special symbol (“@#$%”).
     * 
     */
    private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,16})";

    /**
     * 3 Characters to 20 Characters
     */
    private static final String MINIMUM_THREE_CHARACTERS = "^[a-z0-9_-]{3,20}$";

    /**
     * Email Validator with Regular Expression
     */
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    @Test
    public void emailvalidate() {
        pattern = Pattern.compile(EMAIL_PATTERN);
        String email = "a.little.lengthy.but.fine@dept.example.com";
        matcher = pattern.matcher(email);
        // return matcher.matches();
        System.out.println("Email with Regx : " + matcher.matches());

    }

    @Test
    public void emailValidator() {
        String user = "anna@gmail.com";
        String emailMatcher = "^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$";
        boolean message = true;
        if (!user.matches(emailMatcher)) {
            message = false;
        }
        System.out.println(message);
        // return message;
    }

    @Test
    public void phoneNumberValidator() {
        String phoneNumber = "";
        boolean message = true;
        if (!Boolean.parseBoolean(phoneNumber)
                && !phoneNumber.replace("-", "").matches("\\d{10}")) {
            message = false;
        }
        System.out.println("Phone No 10 Char" + message);
        // return message;
    }

    @Test
    public void voidfirstNameValidator() {
        String name = "name";
        boolean message = true;
        if (name == null || name.trim().equals("")
                || !name.isEmpty ()) {
            message = false;
        }
        System.out.println("Name Not null :" + message);
        // return message;
    }

    @Test
    public void lastNameValidator() {
        boolean message = true;
        String name = " ";
        if (name == null || name.trim().equals("")
                || !name.isEmpty ()) {
            message = false;
        }
        System.out.println(message);
        // return message;
    }

    @Test
    public void loyaltyNumberValidator() {
        String loyaltyNumber = "123456789";
        boolean message = true;
        if (!Boolean.parseBoolean(loyaltyNumber)
                && !loyaltyNumber.replace("-", "").matches("\\d{9}")) {
            message = false;
        }
        System.out.println("Loyalty 9 Char:" + message);
        // return message;
    }

    @Test
    public void passwordValidator() {
        String password = "annadaaaaaaaa1A@";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);
        System.out.println("pwd :" + matcher.matches());
        // return matcher.matches();

    }

    @Test
    public void securityAnswerValidator() {
        String answer = "1234";
        pattern = Pattern.compile(MINIMUM_THREE_CHARACTERS);

        matcher = pattern.matcher(answer);
        // return matcher.matches();

        System.out.println("minimum of 3 characters : " + matcher.matches());
    }

    @Test
    public void dateValidator() {
        // 1965-08-09
        DateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateAsString = "1965-08-09";
        try {
            Date date = sourceFormat.parse(dateAsString);
            System.out.println("date --- : " + date);
            System.out.println("yyyy-MM-dd --"+ new SimpleDateFormat("yyyy-MM-dd").format(date));
            System.out.println("MM-dd-yyyy --"+new SimpleDateFormat("MM-dd-yyyy").format(date));
            System.out.println("dd/MM/yyyy --"+new SimpleDateFormat("dd/MM/yyyy").format(date));
            System.out.println("dd/yyyy/MM --"+new SimpleDateFormat("dd/yyyy/MM").format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
