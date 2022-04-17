package somesubjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
We use try-with-resources try-catch block to auto-close resources

you can define your auto-completing resources as follows:
AutoCloseable interface is used for that task
public class MyResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Closed MyResource");
    }
}
 */
public class TryWithResources {
    public static void main(String[] args) {
       writeDataToFile();
       readDataFromFile1();
       readDataFromFile2();
    }
    public static void writeDataToFile(){
        try(PrintWriter writer = new PrintWriter(new File("test.txt"))){
            writer.println("Hello World");
        }catch (Exception e){
            e.printStackTrace();
        }// writer resources is automatically closed with close() method after try-catch
    }
    /* This is a classical wat to use resource and close it*/
    public static void readDataFromFile1(){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("test.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close(); //we are closing it with finally
            }
        }
    }
    /* This method is the corresponding version of readDataFromFile1()*/
    public static void readDataFromFile2(){
        try (Scanner scanner = new Scanner(new File("test.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
