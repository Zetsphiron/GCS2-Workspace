package TareaVenganza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zatar\\Documents\\UNISON\\Semestre 8-OCHO\\Área de trabajo GCS2\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://bibliotecas.uson.mx/");

        WebElement textbox = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBuscar"));
        textbox.sendKeys("Java");

        WebElement button = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnBuscar_input"));
        button.click();

        WebElement show_card = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridResultados_ctl00_ctl04_LinkButton1"));
        show_card.click();
    }
}
