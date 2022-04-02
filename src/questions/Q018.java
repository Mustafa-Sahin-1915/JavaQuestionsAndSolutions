package questions;
/*
write the fibonacci series up to n-th terms
 */
public class Q018 {
    public static void main(String[] args) {
        int number =20;
        fibonacci(number);

        //print with recursive implementation of fibonacci
        for (int i = 1; i < number+1; i++) {
            if (i==number){
                System.out.println(fibonacci2(i)+",...");
            }else{
                System.out.print(fibonacci2(i)+",");
            }
        }
    }
    public static void fibonacci(int num){
        int a=0;
        int b=1;
        int c; //stores counter-th fibonacci
        int counter = 2;
        while (counter<=num){
            c = a+b;
            a=b;
            b=c;
            if (counter==2) {
                System.out.print(1 + ",");
                System.out.print(1 + ",");
            }else if (counter==num){
                System.out.println(c+",...");
            }else{
                System.out.print(c+",");
            }
            counter++;
        }
    }
    public static int fibonacci2(int number){
        if (number==1 || number ==2){
            return 1;
        }
        return fibonacci2(number-1) + fibonacci2(number-2);
    }
}
