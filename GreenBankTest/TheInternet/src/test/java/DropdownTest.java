import org.junit.jupiter.api.Test;

public class DropdownTest extends BaseTest {

  private final static String BASE_URL = "https://the-internet.herokuapp.com/";

  @Test
  public void checkElement() {
    MainPage mainPage = new MainPage(BASE_URL);
    mainPage.clickSearchDropdown();
    DropdownPage checkDropDown = new DropdownPage();
    checkDropDown.clickDropdown();
    checkDropDown.clickOption1();
    checkDropDown.clickOption2();

  }
}
