package by.epam.rudenkov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {

	private final static String LOGIN_NAME = "#";
	private final static String LOGIN_PASS = "#";
	private final static String URL_RP = "https://reportportal.epmc-tst.projects.epam.com:8443";
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get(URL_RP);
		login();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		runSwitcher();
	}

	private static void login() {
		LoginScreen loginScreen = new LoginScreen(driver);
		loginScreen.expandFullScreen();
		loginScreen.setName(LOGIN_NAME);
		loginScreen.setPassword(LOGIN_PASS);
		loginScreen.clickSignIn();

	}

	private static void runSwitcher() {
		DashboardScreen dashboardScreen = new DashboardScreen(driver);
		dashboardScreen.dashboardSwitherRun();

	}
}
