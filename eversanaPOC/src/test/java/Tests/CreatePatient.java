package Tests;

import Pages.PageElements;
import org.apache.poi.sl.usermodel.ObjectMetaData;
import org.apache.poi.sl.usermodel.ObjectMetaData.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.naming.directory.SearchResult;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;



public class CreatePatient extends PageElements


{
    @Test(priority = 1)
    public void scenario1Test() throws InterruptedException, AWTException, IOException {

        FileInputStream datafile = new FileInputStream("C:\\Users\\mahanand.kalita\\Desktop\\Eversana\\eversanaPOC\\src\\test\\resources\\TestData.properties");
        Properties propfile = new Properties();
        propfile.load(datafile);


       //Application main = new Application();
        //File file = new File("C:\\Users\\mahanand.kalita\\IdeaProjects\\eversanaPOC\\build\\resources\\test\\TestData.properties");
        //FileInputStream fileInput = null;
        //try {
          //  fileInput = new FileInputStream(file);
        //} catch (FileNotFoundException e) {
          //  e.printStackTrace();
        //}
       // Properties prop = new Properties();

        //try {
          //  prop.load(fileInput);
        //} catch (IOException e) {
          //  e.printStackTrace();
        //}
         //System.out.println(prop.getProperty("ProgramName"));
        //System.setProperty("webdriver.gecko.driver","Q:\\ChromeDriver\\chromedriver.exe");
        //WebDriver driver= new ChromeDriver();
        System.setProperty("webdriver.gecko.driver","Q:\\GeckoDriver\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //driver.get("URL");
        //driver.get("https://mbaviskar:2249@Bavi!@crmirdapp.triplefin.com/INTRX365CRM/main.aspx#794992439");
        driver.get(propfile.getProperty("URL"));



        Thread.sleep(20000);

        Actions actions = new Actions(driver); 
        actions.moveByOffset(500,500).doubleClick().build().perform();

         Robot rbt =new Robot();
        rbt.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);



        driver.findElement(Tab_Service).click();
        Thread.sleep(2000);
        driver.findElement(Tab_Programs).click();
        Thread.sleep(15000);
        //driver.findElement(By.className("TabCS")).click();

        // driver.findElement(By.cssSelector("#crmGrid_quickFindContainer")).click();
        WebElement mainframe = driver.findElement(By.id("contentIFrame0"));
        driver.switchTo().frame(mainframe);

        driver.findElement(Input_Search).click();
        driver.findElement(Input_SearchField).sendKeys(propfile.getProperty("ProgramName"));
        Thread.sleep(1000);
        driver.findElement(ButtonSearch).click();

        driver.findElement(SearchResult).click();
        rbt.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(12000);
        driver.switchTo().defaultContent();
        WebElement mainframe1 = driver.findElement(By.id("contentIFrame1"));
        driver.switchTo().frame(mainframe1);

        driver.findElement(ButtonAdd).click();

        Thread.sleep(5000);
        //System.out.println("Name of the window : " + driver.getTitle());
        //driver.switchTo().window("Program: JJPAF");


        String parentWindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for(String windowHandle : handles)
        {
            if(!windowHandle.equals(parentWindow))
            { driver.switchTo().window(windowHandle);
                driver.manage().window().maximize();
                //<!--Perform your operation here for new window-->
                System.out.println("Name of the window : " + driver.getTitle());


                driver.switchTo().defaultContent();
                WebElement mainframe2 = driver.findElement(By.id("contentIFrame0"));
                driver.switchTo().frame(mainframe2);
                Thread.sleep(5000);

                //driver.findElement(By.xpath("//div[@id='firstname']//div[@class='ms-crm-Inline-Value']")).click();
                //Thread.sleep(2000);

                driver.findElement(Input_Salutation).click();
                Select salutation = new Select(driver.findElement(Input_SalutationField));
                salutation.selectByVisibleText(propfile.getProperty("Salutation"));

                //driver.findElement(Input_Firstname).click();
                driver.findElement(Input_FirstnameField).sendKeys(propfile.getProperty("Firstname"));
                driver.findElement(Input_Lastname).click();
                driver.findElement(Input_LastnameField).sendKeys(propfile.getProperty("Lastname"));

                driver.findElement(Input_Gender).click();
                Select gender= new Select(driver.findElement(Input_GenderField));
                gender.selectByVisibleText(propfile.getProperty("PatientGender"));

                driver.findElement(Input_Dateofbirth).click();
                driver.findElement(Input_DateofbirthField).sendKeys(propfile.getProperty("DateOfBirth"));

                driver.findElement(Input_SSN).click();
                driver.findElement(Input_SSNField).sendKeys(propfile.getProperty("SSN"));

                driver.findElement(Input_PreferredLang).click();
                Select preflanguage= new Select(driver.findElement(Input_preferredLangField));
                preflanguage.selectByVisibleText(propfile.getProperty("PreferredLanguage"));

                driver.findElement(Input_Email).click();
                driver.findElement(Input_EmailField).sendKeys(propfile.getProperty("EmailID"));

                driver.findElement(Input_Primaryphone).click();
                Select primaryphone= new Select(driver.findElement(Input_PrimaryphoneField));
                primaryphone.selectByVisibleText(propfile.getProperty("PrimaryPhone"));

                driver.findElement(Input_Mobilephone).click();
                driver.findElement(Input_MobilephoneField).sendKeys(propfile.getProperty("PhoneNumber"));

                driver.findElement(Input_Address1).click();
                driver.findElement(Input_Address1Field).sendKeys(propfile.getProperty("AddressLine1"));

                driver.findElement(Input_Address1City).click();
                driver.findElement(Input_Address1CityField).sendKeys(propfile.getProperty("City"));

                driver.findElement(Input_State).click();
                driver.findElement(Input_StateField).sendKeys(propfile.getProperty("StateCode"));
                rbt.keyPress(KeyEvent.VK_ENTER);
                Thread.sleep(1000);
                rbt.keyPress(KeyEvent.VK_ENTER);

                driver.findElement(Input_Zipcode).click();
                driver.findElement(Input_ZipcodeField).sendKeys(propfile.getProperty("Zipcode"));
                rbt.keyPress(KeyEvent.VK_ENTER);
                Thread.sleep(1000);
                rbt.keyPress(KeyEvent.VK_ENTER);


                driver.switchTo().defaultContent();

                driver.findElement(ButtonSave).click();
                Thread.sleep(5000);

                driver.switchTo().frame(mainframe2);


                String patiendID = driver.findElement(PatiendID).getText();
                System.out.println("Patiend ID = " + patiendID);

                driver.switchTo().defaultContent();
                driver.findElement(ButtonSaveAndClose).click();

                Thread.sleep(2000);                                     

                //driver.close();
                //closing child window
                driver.switchTo().window(parentWindow);
                //cntrl to parent window
            }

        }


        //driver.switchTo().defaultContent();


        driver.quit();

    }

}



