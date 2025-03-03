import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckDragAndDropsTest extends BaseTest {

  private final static String BASE_URL = "https://the-internet.herokuapp.com/";

  @Test
  public void checkElement() {
    MainPage mainPage = new MainPage(BASE_URL);
    mainPage.clickSearchDragAndDrop();
    CheckDragAndDrops checkDragAndDrops = new CheckDragAndDrops();
    checkDragAndDrops.drag_and_dropAtoB();
    checkDragAndDrops.drag_and_dropBtoA();


  }

}
