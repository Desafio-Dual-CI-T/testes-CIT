/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.teste.Testes;
import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Junin
 */
public class Cenario1Test { 
    
    static WebDriver driver;
    static Testes cenario1;
    public Cenario1Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
         File file = new File("C:\\Users\\JUNIO\\Downloads\\chrome\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://opentdb.com/");
        
        cenario1 = new Testes(driver);
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @CadastroTest. For example:
    //
     @org.junit.jupiter.api.Test
    public void test() {
        cenario1.preencheCampos();
       
    }
}
    
    
  
