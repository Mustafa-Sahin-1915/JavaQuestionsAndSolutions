package questions;

/*

write a return method that can verify if a password is valid or not
requirements:
-password must be at least 6 characters and should not contain space
-password should contain at least one upper case letter
-password should contain at least one lowercase letter
-password should contain at least one special character
-password should contain at least one digit

if all requirements are met then return true else return false

 */
public class Q006 {
    public static void main(String[] args) {
        System.out.println(isValidPassword("123abc#$%"));//false
        System.out.println(isValidPassword("123abC#$%"));//true

        System.out.println(isValidPassword2("123abc#$%"));//false
        System.out.println(isValidPassword2("123abC#$%"));//true

        System.out.println(isValidPassword3("123abc#$%"));//false
        System.out.println(isValidPassword3("123abC#$%"));//true
    }

    public static boolean isValidPassword(String s) { //123abc#$%
        if (s == null) return false;
        if (s.length() < 6) return false;
        if (s.contains(" "))return false;

        int count = 0;
        char ch;
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int specialCount = 0;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') lowercaseCount++;
            else if (ch >= 'A' && ch <= 'Z') uppercaseCount++;
            else if (ch >= '0' && ch <= '9') digitCount++;
            else if ((ch >= 33 && ch <= 47) ||
                    (ch >= 58 && ch <= 64) ||
                    (ch >= 91 && ch <= 96) ||
                    (ch >= 123 && ch <= 126)) specialCount++;
        }
        return (lowercaseCount > 0
                && uppercaseCount > 0
                && digitCount > 0
                && specialCount > 0);

    }

    public static boolean isValidPassword2(String s) {//123abc#$%
        if (s == null) return false;
        // \\w:[0-9a-zA-Z]   \\s: any white space
        // except of \\w and \\s  are called special characters

        String passwordRegex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[^\\w\\s]).{6,}$";
        // String passwordRegex="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$";

        if (!s.matches(passwordRegex)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isValidPassword3(String s) { //123abc#$%
        if (s == null) return false;
        if (s.length() < 6) return false;
        if (s.contains(" "))return false;

        String upperCaseRegex="(.*[A-Z].*)";
        String lowerCaseRegex="(.*[a-z].*)";
        String digitRegex="(.*[0-9].*)";
        String specialRegex="(.*[^\\w\\s].*)";


      if (!s.matches(upperCaseRegex))return false;
        if (!s.matches(lowerCaseRegex))return false;
       if (!s.matches(digitRegex))return false;
       if (!s.matches(specialRegex))return false;

        return true;
    }


}
