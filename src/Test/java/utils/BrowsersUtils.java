package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

public class BrowsersUtils {

    public static WebDriver getDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "firefox": {
                return new FirefoxDriver();
            }
            case "chrome": {
                return new ChromeDriver();
            }
            case "edge": {
                return new EdgeDriver();
            }
            case "safari": {
                return new SafariDriver();
            }
            default: {
                return new ChromeDriver();
            }
        }
    }
}