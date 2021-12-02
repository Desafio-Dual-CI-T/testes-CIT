/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Junin
 */
public class Testes {

    static WebDriver driver;

    public Testes(WebDriver driver) {
        Testes.driver = driver;
    }

    
    
    public void preencheCampos() throws Exception {
        driver.get("https://opentdb.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        
       
        WebElement browser = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a"));
        browser.click();
       
        Thread.sleep(1000); 
        
        WebElement busca = driver.findElement(By.id("query"));
        busca.sendKeys("Science: Computers");
        
        Thread.sleep(1000); 

        WebElement pesquisar = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button/i"));
        pesquisar.click();
        
        Thread.sleep(4000);

        driver.quit();
  
    }
    
    
  
    
    public void selectCategory() throws Exception {
        driver.get("https://opentdb.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        
        
        WebElement browser = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a"));
        browser.click();
        
        Thread.sleep(1000);
        
        
        WebElement busca = driver.findElement(By.id("query"));
        busca.sendKeys("Science: Computers");
        
        Thread.sleep(1000);
        
        Select categoria = new Select(driver.findElement(By.xpath("//*[@id=\"type\"]")));
        categoria.selectByValue("Category");
        
        
        Thread.sleep(1000);
        
        WebElement pesquisar = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button/i"));
        pesquisar.click();
        
        Thread.sleep(4000);
        
        
        
        
        WebElement numq = driver.findElement(By.tagName("tbody"));
        
        
        List<WebElement> questions = numq.findElements(By.tagName("tr"));
        
         int contador = 0;
         
         for (WebElement objquestions : questions){
     
             
          String  strLinkText =  objquestions.getText();
            
          System.out.println(  strLinkText );
        
             contador++; 
            
        }
         
      boolean textFound = false;  
    try {
    driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[2]/center/ul"));
    textFound = true;
    } catch (Exception e) {
    textFound = false;
    
    }   

    
        if( textFound = true)
            
        {
            System.out.println("\n Existe o controle de paginação \n ");
            WebElement paginacao2 = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[2]/center/ul/li[2]/a"));
        paginacao2.click();
        
        Thread.sleep(1000);
        
            WebElement paganicao1 = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[2]/center/ul/li[2]/a"));
        paganicao1.click();
        
         Thread.sleep(1000);
        }
         
        else  {
        
        System.out.println("\n Não Existe o controle de paginação \n");  
             
        }
        
        
         driver.quit(); 
         
         System.out.println("\n O numero de questões exibidas são: " + contador +"\n");
          
    }
    
    
    
     
    
    
    
    
    
    public void preencher() throws InterruptedException {
        
        driver.get("https://opentdb.com/");
        
       
        
        
       
        WebElement browser = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a"));
        browser.click();
        
        Thread.sleep(1000);

        WebElement busca = driver.findElement(By.id("query"));
        busca.sendKeys("Entertainment");
        
        Thread.sleep(1000);
        
        WebElement pesquisar = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button/i"));
        pesquisar.click();
        
        Thread.sleep(1000);

        WebElement acessar = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[2]/table/tbody/tr[1]/td[6]/a"));
        acessar.click();
        
        Thread.sleep(4000);
        
        
            driver.quit();
         
            
            
    }
    
    
    
    }
