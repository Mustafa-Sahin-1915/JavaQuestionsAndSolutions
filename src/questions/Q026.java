package questions;
/*
How we can prevent an object creation except defining it abstract.
Also This class must allow only one copy of itself.
There must be only one copy of it and every other objects and classes
in the project must use that copy.

Singleton  OOP Design Pattern
 */
public final class Q026 {
    private static Q026 instance = new Q026();

    public String user;

    public static void main(String[] args) {
        Q026 q1 = new Q026();
    }

    public static Q026 getInstance(){
        return instance;
    }

    private Q026() {

    }
}
