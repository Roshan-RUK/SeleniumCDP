import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v107.emulation.Emulation;

public class cdpCommandTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C://CHromeDriverJava/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		Map deiceMetrics = new HashMap();
		deiceMetrics.put("width", 600);
		deiceMetrics.put("height", 1000);
		deiceMetrics.put("deviceScaleFactor", 50);
		deiceMetrics.put("mobile", true);
		
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deiceMetrics);
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.className("navbar-toggler-icon")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(5);
		driver.findElement(By.linkText("Library")).click();
		Thread.sleep(5);
		driver.close();
	}

}
