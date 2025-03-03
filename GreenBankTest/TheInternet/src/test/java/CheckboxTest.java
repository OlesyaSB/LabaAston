import org.junit.jupiter.api.Test;

public class CheckboxTest extends BaseTest {

  private final static String BASE_URL = "https://the-internet.herokuapp.com/";

  @Test
  public void checkElement() {
    MainPage mainPage = new MainPage(BASE_URL);
    mainPage.clickSearchCheckbox();
    CheckboxPage checkboxPage = new CheckboxPage();
    checkboxPage.checkboxNotChecked1();
    checkboxPage.checkboxIsChecked2();
    checkboxPage.checkbox1Click();
    checkboxPage.checkboxIsChecked1();
    checkboxPage.checkbox2Click();
    checkboxPage.checkboxNotChecked2();

  }
}

