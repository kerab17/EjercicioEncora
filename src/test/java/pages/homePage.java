package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage{

    WebDriver driver;
    String passwordvar;

    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    //REGISTRO
    By btnRegister = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");
    By txtFirstName = By.xpath("//*[@id=\"customer.firstName\"]");
    By txtLastName = By.xpath("//*[@id=\"customer.lastName\"]");
    By txtAddress = By.xpath("//*[@id=\"customer.address.street\"]");
    By txtCity = By.xpath("//*[@id=\"customer.address.city\"]");
    By txtState = By.xpath("//*[@id=\"customer.address.state\"]");
    By txtZipCode = By.xpath("//*[@id=\"customer.address.zipCode\"]");
    By txtPhone = By.xpath("//*[@id=\"customer.phoneNumber\"]");
    By txtSSN = By.xpath("//*[@id=\"customer.ssn\"]");
    By txtUsername = By.xpath("//*[@id=\"customer.username\"]");
    By txtPassword = By.xpath("//*[@id=\"customer.password\"]");
    By txtConfirm = By.xpath("//*[@id=\"repeatedPassword\"]");
    By btnRegisterForm = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");
    By btnlogOut = By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a");

    //LOGIN

    By userLogin = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    By userPassword = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    By btnLogin = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");


    //REGISTRO
    public void clickRegister(){
        driver.findElement(btnRegister).click();
    }
    public void registerFirstName(String texto){
        driver.findElement(txtFirstName).sendKeys(texto);
    }
    public void registerLastName(String texto){
        driver.findElement(txtLastName).sendKeys(texto);
    }
    public void registerAddress(String texto){
        driver.findElement(txtAddress).sendKeys(texto);
    }
    public void registerCity(String texto){
        driver.findElement(txtCity).sendKeys(texto);
    }
    public void registerState(String texto){
        driver.findElement(txtState).sendKeys(texto);
    }
    public void registerZipCode(String texto){
        driver.findElement(txtZipCode).sendKeys(texto);
    }
    public void registerPhone(String texto){
        driver.findElement(txtPhone).sendKeys(texto);
    }
    public void registerSSN(String texto){
        driver.findElement(txtSSN).sendKeys(texto);
    }
    public void registerUsername(String texto){
        driver.findElement(txtUsername).sendKeys(texto);

    }
    public void registerPassword(String texto){
        driver.findElement(txtPassword).sendKeys(texto);
        passwordvar = texto;
    }
    public void registerConfirm(){
        driver.findElement(txtConfirm).sendKeys(passwordvar);
    }
    public void registerFormBtn(){
        driver.findElement(btnRegisterForm).click();
    }
    public void setBtnlogOut(){
        driver.findElement(btnlogOut).click();
    }

    //LOGIN
    public void ingresoUser(String texto){
        driver.findElement(userLogin).sendKeys(texto);
    }
    public void ingresoPassword(String texto){
        driver.findElement(userPassword).sendKeys(texto);
    }
    public void setBtnLogin(){
        driver.findElement(btnLogin).click();
    }

}
