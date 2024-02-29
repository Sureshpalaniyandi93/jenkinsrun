import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleFile {
    public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.get("https://uat.portal.infinitbar.com/");
//        System.out.println("finally executed");
//        driver.quit();
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Samsung Galaxy");
        searchBox.submit();

        // Iterate through 10 pages of search results
        for (int i = 1; i <= 10; i++) {
            System.out.println("Page " + i + ":\n-------------------");

            // Print text from the current page
            System.out.println(driver.findElement(By.tagName("body")).getText());

            // Click on the next page button
          
            // Wait for a short while for the next page to load
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Close the browser
        driver.quit();
    }
}
