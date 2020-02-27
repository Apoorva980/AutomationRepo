package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {

		Properties P = new Properties();

		FileInputStream File = new FileInputStream(
				"D:\\AutomationRepo\\BasicCoreJavaPractise\\src\\filehandling\\Readfile");

		P.load(File);

		System.out.println(P.get("Password"));

	}

}
