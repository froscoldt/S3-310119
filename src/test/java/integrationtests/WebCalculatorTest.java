package integrationtests;


import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.HttpClient;

/**
 *
 * @author Mark
 */
public class WebCalculatorTest {
    
    public WebCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void addWebTest() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/WebApplication/calculator");
        String actual = client.makeHttpRequest("?operation=add&n1=2&n2=3");
        String expected = "Result of: 2+3= 5";
        assertEquals(expected, actual);
    }
    

    @Test
    public void subWebTest() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/WebApplication/calculator");
        String actual = client.makeHttpRequest("?operation=sub&n1=2&n2=3");
        String expected = "Result of: 2-3= -1";
        assertEquals(expected, actual);
    }
    

    @Test
    public void mulWebTest() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/WebApplication/calculator");
        String actual = client.makeHttpRequest("?operation=mul&n1=2&n2=3");
        String expected = "Result of: 2*3= 6";
        assertEquals(expected, actual);
    }
    

    @Test
    public void divWebTest() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/WebApplication/calculator");
        String actual = client.makeHttpRequest("?operation=div&n1=2&n2=3");
        String expected = "Result of: 2/3= 0";
        assertEquals(expected, actual);
    }
    
}
