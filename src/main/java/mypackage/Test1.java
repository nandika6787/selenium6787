package mypackage;
import org.openqa.selenium.By;//
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import newpackage.x.Test;
public class Test1 {
    private static boolean actualTitle;

    int x=0;
    public String titleTest(String url) throws InterruptedException {
        // declaration and instantiation of objects/variables
        Test t = new Test();
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\subha\\Documents\\Joyee Chatterjee\\selenium\\chromedriver_win32_100\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       // String baseUrl = "https://amazon.com/";
        //String expectedTitle = new String("Welcome: Mercury Tours all");
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(url);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*System.out.println("actualTitle" + actualTitle);

        //WebElement  button = driver.findElement(By.xpath("//div/div[2]/a/button[@class='primary']"));
        WebElement button1 = driver.findElement(By.xpath("//div/div[2]/div/button[@class='secondary-blue gawebHeaderLogin']"));

        //button.click();
        button1.click();
        WebElement input = driver.findElement(By.xpath("//div[1]/div[2]/input[@class='login_mobileInput__14u_-']"));
        input.sendKeys("9089920812");

        WebElement otpButton = driver.findElement(By.xpath("//div[2]/button[contains(@class,'primary gaLogin login_loginBtn__2Aclv')]"));
        // WebElement otpButton = driver.findElement(By.cssSelector("button.primary.gaLogin.login_numberInvisible__2wYd7.login_loginBtn__2Aclv"));


        otpButton.click();

        Thread.sleep(20000);

        //$x("//div[2]/button[@class='primary gaLogin login_numberInvisible__2wYd7 login_loginBtn__2Aclv']")

        // System.out.println(button.getAttribute("class"));
        *//*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         *//*
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }*/

        //close Fire fox
        driver.close();
        return  actualTitle;
    }

    public static void main(String[] args) throws InterruptedException {
        Test1 test1 = new Test1();
        String baseUrl = "https://amazon.com/";
        String expectedTitle = new String("Welcome: Mercury Tours all");
        String expectedTitle1 = test1.titleTest(baseUrl);
        System.out.println(expectedTitle1);
        if (expectedTitle.contentEquals(expectedTitle1)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");

        }
    }
}
