package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pages.homePage;
import utility.BrowserDriver;



public class basePage {

    private WebDriver driver;
    private homePage HomePage;
    public basePage() {
        this.driver = BrowserDriver.getDriver();
        this.HomePage = new homePage(driver); // Inicializar HomePage con el driver

    }

    //Scenario: Registro en la web

    @Given("me encuentro en la web parabank")
    public void me_encuentro_en_la_web_parabank(){
      String titleParabank = "ParaBank | Welcome | Online Banking";
        Assert.assertEquals(titleParabank,driver.getTitle());
    }
    @When("ingreso al formulario para registrarme")
    public void ingreso_al_formulario_para_registrarme() {
        HomePage.clickRegister();
    }
    @When("ingreso datos aleatorios al formulario")
    public void ingreso_datos_aleatorios_al_formulario() {
        HomePage.registerFirstName("Kevin");
        HomePage.registerLastName("Ricalde");
        HomePage.registerAddress("Jr.QA-Automation");
        HomePage.registerCity("Lima");
        HomePage.registerState("Ate");
        HomePage.registerZipCode("777");
        HomePage.registerPhone("931186880");
        HomePage.registerSSN("170897");
        HomePage.registerUsername("kricaldeAut");
        HomePage.registerPassword("@kricalde1");
        HomePage.registerConfirm();
        HomePage.registerFormBtn();
    }
    @Then("Debería mostrar un mensaje de éxito")
    public void debería_mostrar_un_mensaje_de_éxito() {
        String textCreate = "ParaBank | Customer Created";
        Assert.assertEquals(textCreate,driver.getTitle());
        HomePage.setBtnlogOut();
    }


    //Scenario: Login en la webS

    @When("ingreso mi usuario y contraseña registrado")
    public void ingreso_mi_usuario_y_contraseña_registrado() {
        HomePage.ingresoUser("kricaldeAut");
        HomePage.ingresoPassword("@kricalde1");
        HomePage.setBtnLogin();

    }
    @Then("Debería mostrarme el resumen de cuenta")
    public void debería_mostrarme_el_resumen_de_cuenta() {
        String titleParabank = "ParaBank | Accounts Overview";
        Assert.assertEquals(titleParabank,driver.getTitle());

    }







}
