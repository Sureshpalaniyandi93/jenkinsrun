import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class sampleFile {
    public static void main(String[] args) {





            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://uat.portal.infinitbar.com/");
            String source = driver.getPageSource();
            System.out.println(source);
//            driver.quit();



//        public void sample2 () {
//
//            WebDriverManager.chromedriver().setup();
//            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            //String source = driver.getPageSource();
//            System.out.println(source);
//            driver.quit();

//        }

//        public void sample1 () {
//
//            WebDriverManager.chromedriver().setup();
//            WebDriver driver = new ChromeDriver();
            driver.get("https://felix.keka.com/#/home/dashboard");
//            String source = driver.getPageSource();
//            System.out.println(source);
//            driver.quit();
//        }


//        public void sample12 () {
//
//            WebDriverManager.chromedriver().setup();
//            WebDriver driver = new ChromeDriver();
            driver.get("https://felix.keka.com/#/home/dashboard");
//            String source = driver.getPageSource();
//            System.out.println(source);
            driver.quit();
        }
    }

