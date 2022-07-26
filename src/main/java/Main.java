import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Test_yandex\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://yandex.ru/");

        WebElement input = driver.findElement(By.xpath("//input[@aria-label='Запрос']"));

        input.click();
        input.sendKeys("25 самых дорогих топ менеджеров России");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

       // WebElement search = driver.findElement(By.xpath("//span [text()='Найти']"));
        input.sendKeys(Keys.ENTER);

        WebElement forbes = driver.findElement(By.xpath("//*[@id=\"search-result\"]/li[1]/div/div[2]/div[1]/a"));
        System.out.println(forbes);
        forbes.click();
    }
}
