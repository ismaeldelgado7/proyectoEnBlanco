package chl.per.apl.app.mantenimiento.test.stepdefinitions;

import chl.per.apl.app.mantenimiento.test.task.OpenUp;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.*;
import cucumber.api.PendingException;
import cucumber.api.java.es.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepRetoTecnico {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Analista");
    }

    @Dado("^Ingreso A La Pagina$")
    public void ingresoALaPagina() {
        theActorInTheSpotlight().attemptsTo(OpenUp.ThePage());
    }


    @Cuando("^Hago Click En El Item$")
    public void hagoClickEnElItem() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^Debería Mostrarme Resultado$")
    public void deberíaMostrarmeResultado() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
