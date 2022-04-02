package questions;

/*
is string alphanumeric ?
means whether it is letter, number or both
 */
public class Q019 {
    public static void main(String[] args) {
        String test1 = "7238287kjaskASDASDmas";//true
        String test2 = "128712mnasmnASDMAS.";//false

        System.out.println(isAlphanumeric(test1));
        System.out.println(isAlphanumeric(test2));

        System.out.println(isAlphanumeric2(test1));
        System.out.println(isAlphanumeric2(test2));
    }

    public static boolean isAlphanumeric(String s) {
        String alpaRegex = "^[\\w\\d]+$";
        //String alpaRegex = "^[a-zA-Z0-9_]+$";

        if (s.matches(alpaRegex)) {
            return true;
        }
        return false;
    }

    public static boolean isAlphanumeric2(String s) {
        s = s.replaceAll("[\\w\\d]","");
        return s.length()==0;
    }

}
