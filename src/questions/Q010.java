package questions;
/*
write a method that can divide two numbers without using division operator

 */
public class Q010 {
    public static void main(String[] args) {
        divideWithoutDivisionOperator(10,2);
    }
    public static void divideWithoutDivisionOperator(int num1,int num2){
        int count = 0;
        if (num2==0){
            System.out.println("cannot divide by zero!");
            return;
        }
        if (num1<num2){
            System.out.println(num1+" cannot be divided by "+num2);
        }
        while(num1>=num2){
            num1 = num1-num2;
            count++;
        }
        System.out.println(count+" with a remainder of "+num1);
    }
}
