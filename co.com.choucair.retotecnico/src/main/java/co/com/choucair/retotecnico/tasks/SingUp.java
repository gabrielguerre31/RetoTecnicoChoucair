package co.com.choucair.retotecnico.tasks;


import co.com.choucair.retotecnico.userinterface.UTestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SingUp implements Task {
    public static SingUp onThePage() {
        return Tasks.instrumented(SingUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestHomePage.SINGUP_BUTTON));
    }
}
