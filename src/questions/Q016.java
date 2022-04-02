package questions;
/*
Write a code to calcuate n factorials
 */
public class Q016 {
    public static void main(String[] args) {

    }
    public static int factorial1(int n){
        int res=1;
        if (n<0) return -1;
        for (int i = 0; i < n; i++) {
            res *= i;
        }
        return res;
    }
    public static int factorial2(int n){
        int result=1;
        try {
            if (n < 0) throw new Exception("n cannot be negative");
            for (int i = 0; i < n; i++) {
                result *= i;
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Please use positive n value");
            return -1;
        }
        return result;
    }
}
