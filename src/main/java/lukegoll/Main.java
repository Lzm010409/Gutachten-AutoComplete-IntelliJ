package lukegoll;

import fall.Fahrzeug;
import fall.Fall;
import fall.Kunde;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import textpicker.AufnahmebogenServiceImpl;

import java.io.File;

public class Main {


    public static void main(String[] args) throws Exception {
        /*AufnahmebogenServiceImpl a1 = new AufnahmebogenServiceImpl();
        Kunde k1 = new Kunde();
        Fahrzeug f1 = new Fahrzeug();
        Fall fall1 = new Fall();
        a1.writeKundenData(k1);
        a1.writeKundenMail(k1);
        a1.writeKundenTel(k1);
        a1.writeFahrzeugData(f1);
        a1.writeFallData(fall1);
        System.out.println(fall1.getSchadenDatumOrt());*/

    String chromeDriverPath="/Users/lukegollenstede/IdeaProjects/Gutachten-Auto-Complete/src/main/resources/chromedriver";
    System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless","--window-size=1920,1200","--ignore-certificate-errors", "--silent");
        WebDriver driver = new ChromeDriver(options);
try {
    driver.get("https://prod.onrex.de/auth/");

    driver.findElement(By.xpath("//input[@name='email']")).sendKeys(userName);
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
    driver.findElement(By.id("loginButton")).click();


    System.out.println("Login Succesfull");
    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshot, new File("/Users/lukegollenstede/Downloads/screenshot.png"));

    // Logout
    driver.findElement(By.id("menuItemClickIndex_dashboard.menu.Logout")).click();
    driver.quit();
    System.out.println("Erfolgreich ausgeloggt");
}catch(Exception e){
    e.printStackTrace();
}



    }

    }
