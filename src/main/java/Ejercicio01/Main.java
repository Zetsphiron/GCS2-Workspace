package Ejercicio01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zatar\\Documents\\UNISON\\Semestre 8-OCHO\\Área de trabajo GCS2\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("www.google.com");

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Cheese!");

        element.submit();

        driver.quit();
    }
}
