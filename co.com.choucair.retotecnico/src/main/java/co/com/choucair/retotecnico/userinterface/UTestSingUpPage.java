package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSingUpPage {
    public static final Target INPUT_FIRSTNAME = Target.the(" where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the(" where do we write the last name  ")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the(" where do we write the email  ")
            .located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the(" where do we select the month of the birthday  ")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the(" where do we select the day of the birthday  ")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the(" where do we select the year of the birthday  ")
            .located(By.id("birthYear"));
    public static final Target INPUT_LENGUAGE = Target.the(" where do we write the lenguague  ")
            .located(By.xpath("//input[@type='search']"));
    public static final Target BUTTON_NEXT = Target.the(" where do we select the next page  ")
            .located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target INPUT_CITY = Target.the(" where do we write the city of residence  ")
            .located(By.id("city"));
    public static final Target SUG_CITY = Target.the(" where do we write the city of residence  ")
            .located(By.xpath("/html/body/div[9]"));
    public static final Target SEL_CITY = Target.the(" where do we write the city of residence  ")
            .located(By.xpath(" /html/body/div[9]/div[1]/span[1]"));
    public static final Target INPUT_CPOSTAL = Target.the(" where we write the postal code of residence  ")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the(" where we write the postal code of residence  ")
            .located(By.xpath("//span[@class='ui-select-match-text pull-left']"));
    public static final Target TEXT_COUNTRY = Target.the(" where we write the postal code of residence  ")
            .located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target BUTTON_NEXT2 = Target.the(" where do we select the next page  ")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target INPUT_COMPUTER = Target.the(" where do we select the next page  ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span"));
    public static final Target TEXT_COMPUTER = Target.the(" where do we select the next page  ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]"));
    public static final Target INPUT_VERSION = Target.the(" where do we select the next page  ")
            .located(By.xpath("//span[@aria-label='Select a Version']"));
    public static final Target TEXT_VERSION = Target.the(" where do we select the next page  ")
            .located(By.xpath("//input[@placeholder='Select a Version']"));
    public static final Target INPUT_LANGUAGE = Target.the(" where do we select the next page  ")
            .located(By.xpath("//span[@aria-label='Select OS language']"));
    public static final Target TEXT_LANGUAGE = Target.the(" where do we select the next page  ")
            .located(By.xpath("//input[@placeholder='Select OS language']"));
    public static final Target INPUT_DEVICE = Target.the(" where do we select the next page  ")
            .located(By.xpath("//span[@aria-label='Select Brand']"));
    public static final Target TEXT_DEVICE = Target.the(" where do we select the next page  ")
            .located(By.xpath("//input[@placeholder='Select Brand']"));
    public static final Target INPUT_MODEL = Target.the(" where do we select the next page  ")
            .located(By.xpath("//span[@aria-label='Select a Model']"));
    public static final Target TEXT_MODEL = Target.the(" where do we select the next page  ")
            .located(By.xpath("//input[@placeholder='Select a Model']"));
    public static final Target INPUT_OS = Target.the(" where do we select the next page  ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));
    public static final Target TEXT_OS = Target.the(" where do we select the next page  ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));
    public static final Target INPUT_PASS = Target.the(" where do we write the city of residence  ")
            .located(By.id("password"));
    public static final Target INPUT_REPASS = Target.the(" where do we write the city of residence  ")
            .located(By.id("confirmPassword"));
    public static final Target INPUT_TERMS = Target.the(" where do we write the city of residence  ")
            .located(By.xpath("//span[@ng-class='{error: userForm.termOfUse.$error.required}']"));
    public static final Target INPUT_POLICY = Target.the(" where do we write the city of residence  ")
            .located(By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));
    public static final Target REGISTER = Target.the(" where do we write the city of residence  ")
            .located(By.xpath("//div[@class='image-box-header']"));












}
