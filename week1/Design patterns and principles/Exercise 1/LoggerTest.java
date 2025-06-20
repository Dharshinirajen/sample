// LoggerTest.java
public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");
        System.out.println(logger1.hashCode());

        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");
        System.out.println(logger2.hashCode());

        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances were created.");
        }
    }
}
