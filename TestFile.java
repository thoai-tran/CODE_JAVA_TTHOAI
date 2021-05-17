
import java.io.*;

public class TestFile {
    public static void main(String [] args) {
        File f = new File("employees.txt");
        if (!f.exists()) return;
        try {
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String details = null;
            try {
                details = bf.readLine();
            }catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(details);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
