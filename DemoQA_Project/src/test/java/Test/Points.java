package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Points {

    @Test
    public void PointsTest() {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://www.cricbuzz.com/cricket-series/8525/womens-big-bash-league-2024/points-table");
        List<WebElement> Teams = driver.findElements(By.xpath("//td[@class=\"cb-srs-pnts-name\"]"));
        List<WebElement> Points = driver.findElements(By.xpath("//td[@class='cb-srs-pnts-td text-bold']"));


        for (int i = 0; i < Teams.size(); i++) {

           String points = Points.get(i).getText();
           int pointsPoints = Integer.parseInt(points);

           if (pointsPoints >= 9) {
               String teamName = Teams.get(i).getText();
               System.out.println(teamName +"--"+pointsPoints);
           }


        }
    }
}
