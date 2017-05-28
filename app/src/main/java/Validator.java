public class Validator {

    public static int validate(String s) {
        int tests_passed = 0;
        if (!(s.equals("Password")) && !(s.equals("PASSWORD")) && !(s.equals("password"))) {
            tests_passed += 1;
        }
        if (s.length() >= 8) {
            tests_passed += 1;
        }
        return tests_passed;
    }
}