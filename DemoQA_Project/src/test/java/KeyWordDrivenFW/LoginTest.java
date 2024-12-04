package KeyWordDrivenFW;

import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest {

    KeyEngine keyEngine ;
    @Test
    public void testLogin() throws IOException {
        KeyEngine keyEngine = new KeyEngine();
        String fileName = "C:\\Users\\Qapitol QA\\IdeaProjects\\MavenProject\\src\\main\\resources\\application.xlsx";
        keyEngine.service(fileName);

    }

}
