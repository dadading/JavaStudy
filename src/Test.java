import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		File f = new File("D:\\99\\1.del");

		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}