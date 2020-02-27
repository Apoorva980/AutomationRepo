package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	public static void main(String[] args) throws IOException {
		
		Properties p  = new Properties ();
		
	FileInputStream file = new FileInputStream("D:\\AutomationRepo\\BasicCoreJava\\src\\filehandling\\OR.properties");
	
	p.load(file);
	
	System.out.println(p.get("age"));
	}

}
