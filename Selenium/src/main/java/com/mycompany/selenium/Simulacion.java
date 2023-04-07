package fidelitas.simulacion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Simulacion {

    static WebDriver driver;

    public static void prueba1() throws InterruptedException {

        driver.get("https://www.dgsc.go.cr/index.html");
        System.out.println("*************El titulo de la pagina es: " + driver.getTitle() + "**************");

        driver.manage().window().maximize();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1920)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"sectionfooter\"]/div[3]/div/a[2]")).click();
        Thread.sleep(5000);

    }

    public static void prueba2() throws InterruptedException {

        driver.get("https://www.dgsc.go.cr/");
        System.out.println("*************El titulo de la pagina es: " + driver.getTitle() + "**************");

        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[6]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"contenido_txtCriterio\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"contenido_txtCriterio\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"contenido_txtCriterio\"]")).sendKeys("oferta");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"contenido_btnBuscar\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"contenido_grvTema\"]/tbody/tr[3]/td[3]/input")).click();
        Thread.sleep(5000);

    }

    /*driver.findElement(By.xpath("//*[@id=\"vVCGNROMIC\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"vVCGNROMIC\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"vVCGNROMIC\"]")).sendKeys("23360236");*/
    public static void prueba3() throws InterruptedException {

        driver.get("https://www.dgsc.go.cr/");
        System.out.println("*************El titulo de la pagina es: " + driver.getTitle() + "**************");

        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"op6\"]")).click();
        Thread.sleep(5000);
        String url = driver.getCurrentUrl();
        String[] urlSplit = url.split("/");

        String urlNuevo = urlSplit[0] + "//" + urlSplit[2];

        driver.get(urlNuevo);
        Thread.sleep(5000);
    }

    public static void prueba4() throws InterruptedException {
        driver.get("https://www.dgsc.go.cr/index.html");
        System.out.println("*************El titulo de la pagina es: " + driver.getTitle() + "**************");

        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"op5\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("gestion2")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"txtnombre\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"txtnombre\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"txtnombre\"]")).sendKeys("Francisco Bonilla Rodriguez");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"txtcedula\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"txtcedula\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"txtcedula\"]")).sendKeys("101110111");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"txttelefono\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"txttelefono\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"txttelefono\"]")).sendKeys("25868300");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"txtcorreo\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"txtcorreo\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"txtcorreo\"]")).sendKeys("Francisco@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"txtdetalle\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"txtdetalle\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"txtdetalle\"]")).sendKeys("Prueba");
        Thread.sleep(5000);
        driver.findElement(By.id("btnenviar")).click();
        Thread.sleep(2000);
    }

    public static void prueba5() throws InterruptedException {
        driver.get("https://www.dgsc.go.cr/index.html");
        System.out.println("*************El titulo de la pagina es: " + driver.getTitle() + "**************");

        driver.manage().window().maximize();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1920)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"sectionfooter\"]/div[3]/div/a[3]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"sectionCont\"]/div/ul[5]/li[1]/a")).click();
        Thread.sleep(5000);

    }

    public static void prueba6() throws InterruptedException {
        driver.get("https://www.dgsc.go.cr/index.html");
        System.out.println("*************El titulo de la pagina es: " + driver.getTitle() + "**************");

        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"sectionCont\"]/div[1]/div[1]/div/a/div/div/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"sectionCont\"]/div[1]/div[2]/div/a/img")).click();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"sectionCont\"]/div[4]/div/a/img")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("reimpresionOfertas")).click();
        Thread.sleep(5000);

    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.out.println("Prueba inicializada");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*\",\"ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);

        //prueba1();
        //prueba2();
        //prueba3();
        //prueba4();
        //prueba5();
        //prueba6();
    }
}
