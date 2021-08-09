package co.com.choucair.retotecnico.stepdefinitions;

import co.com.choucair.retotecnico.model.UTestUserData;
import co.com.choucair.retotecnico.questions.Answer;
import co.com.choucair.retotecnico.tasks.EnterData;
import co.com.choucair.retotecnico.tasks.OpenUp;
import co.com.choucair.retotecnico.tasks.SingUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoTecnicoStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Gabriel wants to register in utest$")
    public void thatGabrielWantsToRegisterInUtest() {
        OnStage.theActorCalled("Gabriel").wasAbleTo(OpenUp.thePage(),(SingUp.onThePage()));
    }

    @When("^he enters the data on the page$")
    public void heEntersTheDataOnThePage(List<UTestUserData> uTestUserData) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterData.onThePage(uTestUserData.get(0).getStrFirstName(),
                uTestUserData.get(0).getStrLastName(),uTestUserData.get(0).getStrEmail(),uTestUserData.get(0).getStrMonth(),
                uTestUserData.get(0).getStrDay(),uTestUserData.get(0).getStrYear(),uTestUserData.get(0).getStrLanguage(),
                uTestUserData.get(0).getStrPostal(),uTestUserData.get(0).getStrCountry(),uTestUserData.get(0).getStrComputer(),
                uTestUserData.get(0).getStrVersion(),uTestUserData.get(0).getStrLanguagePc(), uTestUserData.get(0).getStrDevice(),
                uTestUserData.get(0).getStrModel(),uTestUserData.get(0).getStrOs(),uTestUserData.get(0).getStrPassword()));
    }

    @Then("^he is able to register$")
    public void heIsAbleToRegister(List<UTestUserData> uTestUserData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestUserData.get(0).getStrRegister())));
    }

}
