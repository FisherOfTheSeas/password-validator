public class Validator {

    public static int validate(String s) {
        int tests_passed = 0;
        //Rule 1 - Password must not be any of the strings "Password", "PASSWORD" or "password"
        if (!(s.equals("Password")) && !(s.equals("PASSWORD")) && !(s.equals("password"))) {
            tests_passed += 1;
        }
        //Rule 2 - The password must be at least 8 characters long.
        if (s.length() >= 8) {
            tests_passed += 1;
        }
        // Rule 3 - The password must contain an underscore (_).
        if (s.contains("_")){
            tests_passed +=1;
        }
        for (int i = 0; i < s.length(); i++){
            //Rule 4 - The password must contain at least one digit.
            if (Character.isDigit(s.charAt(i))){
                tests_passed += 1;
            }
            //Rule 5 - The password must contain at least one uppercase letter.
            if (Character.isUpperCase(s.charAt(i))){
                tests_passed += 1;
            }
        }
        return tests_passed;
    }
}