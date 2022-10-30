import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

    public static void main(String[] args) throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\test\\java\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");

        driver.manage().window().fullscreen();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        Thread.sleep(3000);
        driver.findElement(By.className("radius")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
