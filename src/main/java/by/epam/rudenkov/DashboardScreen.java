package by.epam.rudenkov;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardScreen {
	private WebDriver driver;
	private static final String DASHBOARDS_XPATH = "//*[@id='dashdord-container']//ul[@id='dashboard-menu']//a";
	private static final long TIMEOUT_SECONDS = 15;

	public DashboardScreen(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void dashboardSwitherRun() throws InterruptedException {
		List<WebElement> dashBoards = driver.findElements(By.xpath(DASHBOARDS_XPATH));
		System.out.println("RP_Swither starts successful, " + dashBoards.size() + " dashboards, " + TIMEOUT_SECONDS
				+ " second wait between frames.");
		for (;;) {
			for (WebElement board : dashBoards) {
				board.click();

				Thread.sleep(TIMEOUT_SECONDS * 1000);
			}

		}

	}
}
