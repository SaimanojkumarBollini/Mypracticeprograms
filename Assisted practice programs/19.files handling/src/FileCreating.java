import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
 
public class FileCreating {
 
    public static void main(String[] args) {
        String content = "EyeHunt data";
 
        try {
            Files.write(Paths.get("newFile.txt"), content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
        	System.out.println("The file was created");
        }
    }
}
