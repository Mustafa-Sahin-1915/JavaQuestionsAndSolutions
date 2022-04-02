package questions;
/*
Write a method which prints out the numbers from 1 to 30 but for numbers
which are multiple of 3, print "FIN" instead of the number and for numbers
which are multiple of 5, print "RA" instead of the number, for numbers which are
multiple of both 3 and 5, print "FINRA" instead of number.
 */
public class Q011 {
    public static void main(String[] args) {
        printNumbers(30);
        printNumbers2(30);
    }
    public static void printNumbers(int n){
        for (int i = 1; i < n+1; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("FINRA");
            }else if (i%3==0){
                System.out.println("FIN");
            }else if(i%5==0){
                System.out.println("RA");
            }else{
                System.out.println(i);
            }
        }
    }
    public static void printNumbers2(int n){
        for (int i = 1; i < n+1; i++) {
            if (i%3==0 || i%5==0){
                if (i%3==0){
                    System.out.print("FIN");
                }
                if (i%5==0){
                    System.out.println("RA");
                }
                System.out.println();
            }else{
                System.out.println(i);
            }
        }
    }
}
