import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

public class CheckDropdownTest extends BaseTest {

  private final static String BASE_URL = "https://the-internet.herokuapp.com/";

  @Test
  public void checkElement() {
    MainPage mainPage = new MainPage(BASE_URL);
    mainPage.clickSearchDropdown();
    CheckDropDown checkDropDown = new CheckDropDown();
    checkDropDown.clickDropdown();
    checkDropDown.clickOption1();
    checkDropDown.clickOption2();

  }
}
