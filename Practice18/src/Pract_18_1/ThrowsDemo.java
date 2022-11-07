package Pract_18_1;
import java.util.Objects;
import java.util.Scanner;
/**public class ThrowsDemo {
    public void getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails" );
        }
// do something with the key
    }
}**/
/**public class ThrowsDemo {
    public void printMessage(String key) throws Exception{
          String message = getDetails(key);
          System.out.println( message );
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key; }
} **/
public class ThrowsDemo {

    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
       try {
           printDetails(key);
       } catch (Exception e) {
           System.out.println("Wrong key, enter new key");
           getKey();
       }

    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (Objects.equals(key, "0")) {
            throw new Exception("Key set to null string");
        }
        return "data for " + key;
    }
}
