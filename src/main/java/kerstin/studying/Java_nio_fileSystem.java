package kerstin.studying;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;


/**
 * Hello world!
 *
 */
/**
 * @author Kerstin_Kienen
 *
 */
/**
 * @author Kerstin_Kienen
 *
 */
public class Java_nio_fileSystem 
{
    public static void main( String[] args )
    {
        //Java.nio.xxx
        String fileName = "hackaton ideas.txt";
        String filePath = "C:\\Users\\Kerstin_kienen\\Desktop\\";
        
        Path pathString = Paths.get(filePath + fileName);
        Path pathCompose = Paths.get("C:\\Users", "Kerstin_kienen", "Desktop" , fileName);
        Path myZip = Paths.get("C:\\Users", "Kerstin_kienen", "Desktop" , "myZip.zip");
        
        System.out.println("pathString: "+ pathString);
        System.out.println("pathCompose: " + pathCompose);        
		readTehmAll(pathString,pathCompose);
		
		//file System - ZIP file
		/*String[] data = {
				"Line 1",
				"Line 2 2",
				"Line 3 3 3",
				"Line 4 4 4 4",
				"Line 5 5 5 5 5"
		};
		try {
			FileSystem zipFs = openZip(myZip);
			
		} catch (IOException e) {
			e.printStackTrace();
		}*/	
		
    } 
    
     /**
      * Files - java.nio.XXX
     * @param pathString
     * @param pathCompose
     */
    static void readTehmAll(Path pathString, Path pathCompose) {
    	
    	//Read 1
    	List<String> lines;
		try {
			lines = Files.readAllLines(pathCompose);
			for(String line : lines){
	    		System.out.println("line: " + line);
	    	}
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    //FileSystem
    private static FileSystem openZip(Path myZip) throws IOException{
    	Map<String, String> providerProps = new HashMap<>();
		return null;
    	
    }
    
    private static FileSystem copyZip()throws IOException{
		return null;
    	
    }
}
