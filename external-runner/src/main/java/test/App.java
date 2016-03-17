package test;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { TestNgCase1.class, TestNgCase2.class });
        testng.addListener(tla);
        testng.run();
    }
}