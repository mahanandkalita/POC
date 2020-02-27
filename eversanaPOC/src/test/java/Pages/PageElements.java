package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageElements
    {   //public Wait wait;
        //public CreatePatientPage(WebDriver driver)
        //{
        //super(driver);
        //wait = new WebDriverWait(driver,10);
        //}

        public  By Tab_Service = By.xpath("//span[@class='navTabButtonArrowDown']");
        public By Tab_Programs = By.xpath("//a[@id='tf_program']");
        public By Input_Search = By.xpath("//input[@title='Search for records']");
        public By Input_SearchField = By.xpath("//input[@title='Search for records']");
        public By ButtonSearch = By.xpath("//a[@id='crmGrid_findCriteriaButton']");
        public By SearchResult = By.xpath("//*[@id=\"gridBodyTable\"]/tbody/tr/td[3]");
        public By ButtonAdd = By.xpath("//img[@id='Contacts_addImageButtonImage']");
        public By Input_Salutation = By.xpath("//div[@id='tf_salutation']//div[@class='ms-crm-Inline-Value']");
        public By Input_SalutationField = By.xpath("//select[@id='tf_salutation_i']");
        public By Input_Firstname = By.xpath("//div[@id='firstname']");
        public By Input_FirstnameField = By.xpath("//input[@id='firstname_i']");
        public By Input_Lastname = By.xpath("//div[@id='lastname']");
        public By Input_LastnameField = By.xpath("//input[@id='lastname_i']");
        public By Input_Gender = By.xpath("//div[@id='tf_gender']//div[@class='ms-crm-Inline-Value']");
        public By Input_GenderField = By.xpath("//select[@id='tf_gender_i']");
        public  By Input_Dateofbirth = By.xpath("//div[@id='birthdate']//div[@class='ms-crm-Inline-Value']");
        public By Input_DateofbirthField = By.xpath("//input[@id='birthdate_iDateInput']");
        public By Input_SSN = By.xpath("//div[@id='tf_ssn']");
        public By Input_SSNField = By.xpath("//input[@id='tf_ssn_i']");
        public  By Input_PreferredLang = By.xpath("//div[@id='tf_preferredlanguage']//div[@class='ms-crm-Inline-Value']");
        public By Input_preferredLangField = By.xpath("//select[@id='tf_preferredlanguage_i']");
        public By Input_Email = By.xpath("//div[@id='emailaddress1']");
        public By Input_EmailField = By.xpath("//input[@id='emailaddress1_i']");
        public By Input_Primaryphone = By.xpath("//div[@id='tf_primaryphone']//div[@class='ms-crm-Inline-Value']");
        public By Input_PrimaryphoneField = By.xpath("//select[@id='tf_primaryphone_i']");
        public By Input_Mobilephone = By.xpath("//div[@id='mobilephone']");
        public By Input_MobilephoneField = By.xpath("//input[@id='mobilephone_i']");
        public By Input_Address1 = By.xpath("//div[@id='address1_line1']");
        public By Input_Address1Field = By.xpath("//input[@id='address1_line1_i']");
        public By Input_Address1City = By.xpath("//div[@id='address1_city']");
        public By Input_Address1CityField = By.xpath("//input[@id='address1_city_i']");
        public By Input_State = By.xpath("//div[@id='tf_stateprovince']//div[@class='ms-crm-Inline-Value ms-crm-Inline-Lookup']");
        public By Input_StateField = By.xpath("//input[@id='tf_stateprovince_ledit']");
        public By Input_Zipcode = By.xpath("//div[@id='tf_zipcode']//div[@class='ms-crm-Inline-Value ms-crm-Inline-Lookup']");
        public By Input_ZipcodeField = By.xpath("//input[@id='tf_zipcode_ledit']");
        public By ButtonSave = By.xpath("//li[@id='contact|NoRelationship|Form|Mscrm.Form.contact.Save']//a[@class='ms-crm-Menu-Label']");
        public By ButtonSaveAndClose = By.xpath("//li[@id='contact|NoRelationship|Form|Mscrm.Form.contact.SaveAndClose']");
        public  By PatiendID = By.xpath("//*[@id=\"Patient Program ID_label\"]");


        public PageElements inputfirstname(String Patient_Firstname)
        {
           // driver.findElement(Input_Firstname).sendKeys(Patient_Firstname);
            return this;
        }

    }
