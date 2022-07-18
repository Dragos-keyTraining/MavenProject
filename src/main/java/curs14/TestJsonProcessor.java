package curs14;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public class TestJsonProcessor {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		
			JsonProcessor  obj = new JsonProcessor();
			obj.writeJson();
			obj.readJson("email");
			obj.updateJsonFile("email2", "altemail2@altemail2.com");
			obj.readJson("email");
			obj.readJson("name");
			obj.deletefromJsonFile("name");
			obj.readJson("name");

	}
	
	
	/*
	 * 
	 *  git init --> creaza un repo, o rulam doar o singura data
	 *  creem fisier .gitignore
	 *  
	 *  git add .  --> adauga tot  (git add file....)
	 *  git commit -m "intial commit"
	 *  
	 *  git status  --> on branch master ,....
	 *  
	 *  git remote add origin http...
	 *  
	 *  git pull 
	 *  
	 *  git push origin master
	 * 
	 * 
	 * 
	 */
	

}
