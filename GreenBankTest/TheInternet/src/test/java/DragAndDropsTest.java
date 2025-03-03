import org.junit.jupiter.api.Test;

public class DragAndDropsTest extends BaseTest {

  private final static String BASE_URL = "https://the-internet.herokuapp.com/";

  @Test
  public void checkElement() {
    MainPage mainPage = new MainPage(BASE_URL);
    mainPage.clickSearchDragAndDrop();
    DragAndDropsPage checkDragAndDrops = new DragAndDropsPage();
    checkDragAndDrops.drag_and_dropAtoB();
    checkDragAndDrops.drag_and_dropBtoA();


  }

}
