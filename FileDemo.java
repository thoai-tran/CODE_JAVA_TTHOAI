import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {
    public static void main (String args[]) throws IOException
    { File f = new File("f1.txt");
        System.out.println("Ten file là:"+ f.getName());
        System.out.println("Ten file tuyet doi la:"+ f.getAbsoluteFile());
        System.out.println("Duong dan tuyet doi la:"+ f.getAbsolutePath());
        System.out.println("Path chuan la:"+ f.getCanonicalPath());
        System.out.println("Ngay cap nhat cuoi cung la:"+ new Date(f.lastModified()));
        System.out.println("Thuuoc tinh Hidden:"+ f.isHidden());
        System.out.println("Thuoc tinh can-read:"+ f.canRead());
        System.out.println("Thuoc tinh can-write:"+ f.canWrite());
        System.out.println("Kich thuoc:"+ f.length());
    }
}
