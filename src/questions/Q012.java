package questions;
/*
  swap two number without using third element
 */
public class Q012 {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        swap2(a,b);
    }
    public static void swap(int a, int b){
        a = b-a;
        b = b-a;
        a= a+b;
        System.out.println(a+" "+b);
    }
    public static void swap2(int a, int b){
        a+=b-(b=a);
        System.out.println(a+" "+b);
    }
}
