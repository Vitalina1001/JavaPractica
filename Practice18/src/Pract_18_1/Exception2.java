package Pract_18_1;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "\nEnter an integer ");
        String intString = myScanner.next();
       try {
           int i = Integer.parseInt(intString);
           System.out.println( 2/i );
       }
       catch (Exception e)
      // catch (NumberFormatException | ArithmeticException e)
       {
           System.err.println("Число не целое ИЛИ является нулём!");
       }
        finally
       {
           System.out.println("Выполнен finally модуль");
       }
    }
}
