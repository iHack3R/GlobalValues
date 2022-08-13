import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValues {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/data.properties");
        prop.load(file);
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("url"));
    }
}
