package CountJava;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class CountJava {

	public static void main(String[] args ){
		
		try{
			String path = args[0];
			String endsWith = ".java";
			int found = 0;
			System.out.println("Root director: " + path);
			
			searchDirectory(path, endsWith, found);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	private static void searchDirectory(String path, String endsWith, int found){
		try{
			
			String file;
			File folder = new File(path);
			File[] files = folder.listFiles();
			
			for(int i = 0; i < files.length; i++){
				if(files[i].isDirectory()){
					searchDirectory(files[i].getAbsolutePath(), endsWith, found);
				}
				else if(files[i].isFile()){
					file = files[i].getName();
					if(file.endsWith(endsWith)){
						found++;
						LineNumberReader reader = null; 
						reader = new LineNumberReader(new FileReader(files[i].getAbsolutePath()));
						int lines = 0;
						while((reader.readLine()) != null){
							lines++;
						}
						reader.close();
						
						System.out.println(found + " " + file + " lines = " + lines);
					}
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
