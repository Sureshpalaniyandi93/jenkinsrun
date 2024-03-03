import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class sampleFile {
   @Test(invocationCount = 1,priority = -1)
    public void sample() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://uat.portal.infinitbar.com/");
        String source = driver.getPageSource();
        System.out.println(source);
        driver.quit();

    } @Test(invocationCount =2,priority = 5)
    public void sample2() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String source = driver.getPageSource();
        System.out.println(source);
        driver.quit();

    } @Test(invocationCount =3,priority = 0)
    public void sample1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://felix.keka.com/#/home/dashboard");
        String source = driver.getPageSource();
        System.out.println(source);
        driver.quit();
    }





    @Test(invocationCount =3,priority = 0)
    public void sample12() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://felix.keka.com/#/home/dashboard");
        String source = driver.getPageSource();
        System.out.println(source);
        driver.quit();
    }
}
