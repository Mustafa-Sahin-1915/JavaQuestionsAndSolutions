package questions;

/*
 Q:print even numbers on the console from 1 to 40;
 calculate addition of odd numbers from 1 to 40
 except 5 and multiply of 5
 */

public class Q025 {
    public static void main(String[] args) {
        sol1();
    }
    public static void sol1(){
        int sumOddNumber = 0;
        for (int i = 1; i <41 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }else {
                if (i%5!=0){
                    sumOddNumber +=i;
                }
            }
        }
        System.out.println("\n");
        System.out.println("Sum of odd:"+sumOddNumber);
    }

}
