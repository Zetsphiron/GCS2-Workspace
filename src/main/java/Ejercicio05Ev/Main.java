package Ejercicio05Ev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zatar\\Documents\\UNISON\\Semestre 8-OCHO\\Área de trabajo GCS2\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com.mx/imghp?hl=es");

        WebElement searchImageBtn = driver.findElement(By.className("BwoPOe"));
        searchImageBtn.click();
        WebElement pcFileBtn = driver.findElement(By.className("dRSWfb"));
        pcFileBtn.click();
        WebElement fileUploadBtn = driver.findElement(By.name("awyMjb"));
        fileUploadBtn.sendKeys("file-to-upload.png");

        /*
        fileUploadBtn.click();
        driver.quit();
        */

    }
}
