package by.epam.rudenkov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {

	private final static String LOGIN_NAME = "#";
	private final static String LOGIN_PASS = "#";
	private final static String URL_RP = "https://reportportal.epmc-tst.projects.epam.com:8443";
	static WebDriver driver;

	public static void main(String[] args) {
		try {
			driver = new FirefoxDriver();
			driver.get(URL_RP);
			login();
			Thread.sleep(3000);
			runSwitcher();

		} catch (InterruptedException e) {
		} catch (WebDriverException e) {
		} finally {
			try {
				driver.close();
				System.out.println("Programm closed");
			} catch (WebDriverException e) {
				System.out.println("Programm closed");
			}
		}

	}

	private static void login() {
		LoginScreen loginScreen = new LoginScreen(driver);
		loginScreen.expandFullScreen();
		loginScreen.setName(LOGIN_NAME);
		loginScreen.setPassword(LOGIN_PASS);
		loginScreen.clickSignIn();

	}

	private static void runSwitcher() throws InterruptedException {
		DashboardScreen dashboardScreen = new DashboardScreen(driver);
		dashboardScreen.dashboardSwitherRun();

	}
}
