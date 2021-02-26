package Ejercicio04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zatar\\Documents\\UNISON\\Semestre 8-OCHO\\Área de trabajo GCS2\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/autocomplete/");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("Avenida Tercera de Periférico 200, Luis Encinas, Hermosillo, Sonora");

        Thread.sleep(1000);
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        //driver.quit();
    }
}
