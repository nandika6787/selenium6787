package mypackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import newpackage.x.Test;
public class Shopping {

    public String titleTest(String url) throws InterruptedException {//titletest
        // declaration and instantiation of objects/variables
        Test t = new Test();
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\subha\\Documents\\Joyee Chatterjee\\selenium\\chromedriver_win32_100\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // String baseUrl = "https://your logo.com/";
        //String expectedTitle = new String("Welcome: Mercury Tours all");
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(url);

        WebElement  loginbutton = driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));

        loginbutton.click();



        Thread.sleep(20000);

        // get the actual value of the title
        /*actualTitle = driver.getTitle();
        System.out.println("actualTitle" + actualTitle);
        WebElement button1 = driver.findElement(By.xpath("http://automationpractice.com/img/logo.jpg"));
        button1.click();
        WebElement input = driver.findElement(By.xpath("href=\"http://automationpractice.com/index.php?controller=my-account\" rel=\"nofollow\" title=\"Log in to your customer account\">\n" +
                "\t\t\tSign in"));
        input.sendKeys("9089920812");

        CharSequence expectedTitle = null;
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }*/

        driver.close();
        return actualTitle;


    }

    public static void main(String[] args) throws InterruptedException {
        Shopping test2 = new Shopping();
        String baseUrl = "http://automationpractice.com/index.php";
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
