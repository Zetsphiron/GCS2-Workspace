package Ejercicio02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zatar\\Documents\\UNISON\\Semestre 8-OCHO\\Área de trabajo GCS2\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/keypress/");

        WebElement element = driver.findElement(By.id("name"));
        element.sendKeys("Zatarain");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        //driver.quit();
    }
}
