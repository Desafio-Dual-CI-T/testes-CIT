/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author rafap
 */
public class Testes {

    static WebDriver driver;

    public Testes(WebDriver driver) {
        Testes.driver = driver;
    }

    public void preencheCampos() {
        driver.get("https://opentdb.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        
       
        WebElement browser = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a"));
        browser.click();
       
        
        WebElement busca = driver.findElement(By.id("query"));
        busca.sendKeys("Science: Computers");
        
        

        WebElement pesquisar = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button/i"));
        pesquisar.click();


       
    }
    
    public void preencher() {
        
        driver.get("https://opentdb.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        
       
        WebElement browser = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a"));
        browser.click();

        WebElement busca = driver.findElement(By.id("query"));
        busca.sendKeys("Entertainment");
        

        WebElement pesquisar = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button/i"));
        pesquisar.click();

        WebElement acessar = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[2]/table/tbody/tr[1]/td[6]/a"));
        acessar.click();
        
        
    }
    
    public void selectCategory() {
        driver.get("https://opentdb.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        
       
        WebElement browser = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a"));
        browser.click();
        
        Select categoria = new Select(driver.findElement(By.xpath("//*[@id=\"type\"]")));
        categoria.selectByValue("Category");
        
        WebElement busca = driver.findElement(By.id("query"));
        busca.sendKeys("Science: Computers");
        
        

        WebElement pesquisar = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button/i"));
        pesquisar.click();


       
    }
    
    
    
}
