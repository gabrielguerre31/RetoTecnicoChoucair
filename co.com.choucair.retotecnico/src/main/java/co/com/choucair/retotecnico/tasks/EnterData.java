package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.UTestSingUpPage;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


public class EnterData implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strLanguage;
    private String strCity;
    private String strPostal;
    private String strCountry;
    private String strComputer;
    private String strVersion;
    private String strLanguagePc;
    private String strDevice;
    private String strModel;
    private String strOs;
    private String strPassword;

    public EnterData(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay,
                     String strYear, String strLanguage, String strPostal, String strCountry,
                     String strComputer, String strVersion, String strLanguagePc, String strDevice,
                     String strModel, String strOs, String strPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strLanguage = strLanguage;
        this.strPostal = strPostal;
        this.strCountry = strCountry;
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguagePc = strLanguagePc;
        this.strDevice = strDevice;
        this.strModel = strModel;
        this.strOs = strOs;
        this.strPassword = strPassword;
    }

    public static EnterData onThePage(String strFirstName, String strLastName, String strEmail, String strMonth,
                                      String strDay, String strYear, String strLanguage,
                                      String strPostal, String strCountry, String strComputer, String strVersion,
                                      String strLanguagePc, String strDevice, String strModel, String strOs,
                                      String strPassword) {
        return Tasks.instrumented(EnterData.class,strFirstName,strLastName,strEmail,strMonth,strDay,strYear,
                strLanguage,strPostal,strCountry,strComputer,strVersion,strLanguagePc,strDevice,
                strModel,strOs,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Enter.theValue(strFirstName).into(UTestSingUpPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(UTestSingUpPage.INPUT_LASTNAME),Enter.theValue(strLastName).into(UTestSingUpPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UTestSingUpPage.INPUT_EMAIL), SelectFromOptions.byVisibleText(strMonth).from(UTestSingUpPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(UTestSingUpPage.INPUT_DAY),SelectFromOptions.byVisibleText(strYear).from(UTestSingUpPage.INPUT_YEAR),
                Enter.theValue(strLanguage).into(UTestSingUpPage.INPUT_LENGUAGE).thenHit(Keys.ENTER), Click.on(UTestSingUpPage.BUTTON_NEXT),
                Enter.theValue(strPostal).into(UTestSingUpPage.INPUT_CPOSTAL),
                Click.on(UTestSingUpPage.INPUT_COUNTRY),Enter.theValue(strCountry).into(UTestSingUpPage.TEXT_COUNTRY).thenHit(Keys.TAB),
                Click.on(UTestSingUpPage.BUTTON_NEXT2),Click.on(UTestSingUpPage.INPUT_COMPUTER),Enter.theValue(strComputer).into(UTestSingUpPage.TEXT_COMPUTER).thenHit(Keys.TAB),
                Click.on(UTestSingUpPage.INPUT_VERSION),Enter.theValue(strVersion).into(UTestSingUpPage.TEXT_VERSION).thenHit(Keys.TAB),
                Click.on(UTestSingUpPage.INPUT_LANGUAGE),Enter.theValue(strLanguagePc).into(UTestSingUpPage.TEXT_LANGUAGE).thenHit(Keys.TAB),
                Click.on(UTestSingUpPage.INPUT_DEVICE),Enter.theValue(strDevice).into(UTestSingUpPage.TEXT_DEVICE).thenHit(Keys.TAB),
                Click.on(UTestSingUpPage.INPUT_MODEL),Enter.theValue(strModel).into(UTestSingUpPage.TEXT_MODEL).thenHit(Keys.TAB),
                Click.on(UTestSingUpPage.INPUT_OS),Enter.theValue(strOs).into(UTestSingUpPage.TEXT_OS).thenHit(Keys.TAB),
                Click.on(UTestSingUpPage.BUTTON_NEXT2),Enter.theValue(strPassword).into(UTestSingUpPage.INPUT_PASS),
                Enter.theValue(strPassword).into(UTestSingUpPage.INPUT_REPASS),Click.on(UTestSingUpPage.INPUT_TERMS),
                Click.on(UTestSingUpPage.INPUT_POLICY),Click.on(UTestSingUpPage.BUTTON_NEXT)
        );

    }
}
