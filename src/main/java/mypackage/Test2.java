package mypackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import newpackage.x.Test;
public class Test2 {

    public String titleTest(String url) throws InterruptedException {//titletest
        // declaration and instantiation of objects/variables
        Test t = new Test();
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\subha\\Documents\\Joyee Chatterjee\\selenium\\chromedriver_win32_100\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // String baseUrl = "https://muzigal.com/";
        //String expectedTitle = new String("Welcome: Mercury Tours all");
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(url);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        driver.close();
        return actualTitle;
    }

    public static void main(String[] args) throws InterruptedException {
        Test2 test2 = new Test2();
        String baseUrl = "https://muzigal.com/";
        String expectedTitle = new String("Welcome: Mercury Tours all");
        String expectedTitle1 = test2.titleTest(baseUrl);
        System.out.println(expectedTitle1);
        if (expectedTitle.contentEquals(expectedTitle1)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
    }
}
