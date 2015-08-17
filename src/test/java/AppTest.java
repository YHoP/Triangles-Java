import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("What type of Triangle?");
  }

  @Test
  public void grabUsername() {
    goTo("http://localhost:4567/");
    fill("#username").with("morgan");
    submit(".btn");
    assertThat(pageSource()).contains("morgan");
  }

  @Test
  public void isTriangleEquilateral() {
    goTo("http://localhost:4567/");
    fill("#sideA").with("2");
    fill("#sideB").with("2");
    fill("#sideC").with("2");
    submit(".btn");
    assertThat(pageSource()).contains("Equilateral");
  }
}
