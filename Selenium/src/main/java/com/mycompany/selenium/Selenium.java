/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author emers
 */
public class Selenium {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\drivers");
        System.out.println("Prueba inicializada");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*\",\"ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);

        // prueba3();
        prueba5();
        // prueba6();
    }

    public static void prueba3() {

        driver.get("https://www.dgsc.go.cr/");
        System.out.println("*************El titulo de la pagina es: " + driver.getTitle() + "**************");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"op6\"]")).click();

        String url = driver.getCurrentUrl();
        String[] urlSplit = url.split("/");

        String urlNuevo = urlSplit[0] + "//" + urlSplit[2];

        driver.get(urlNuevo);
    }

    public static void prueba5() {
        driver.get("https://www.dgsc.go.cr/index.html");
        System.out.println("--- El titulo de la pagina es: " + driver.getTitle() + " ---");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"sectionCont\"]/div[1]/div[1]/div/a/div/div/span")).click();

    }

    public static void prueba6() {
        driver.get("https://www.dgsc.go.cr/index.html");
        System.out.println("*************El titulo de la pagina es: " + driver.getTitle() + "**************");

        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1920)");

        driver.findElement(By.xpath("//*[@id=\"sectionfooter\"]/div[3]/div/a[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"sectionCont\"]/div/ul[5]/li[1]/a")).click();

    }

}
