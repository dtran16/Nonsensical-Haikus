import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Noun1 {
	private String[] n1;
	public Noun1(){
		try{
			File myFile = new File ("1syllablenouns.txt");
			Scanner in = new Scanner(myFile);
			n1 = new String[5865];
			for(int i = 0; i < n1.length; i++){
				n1[i]=(in.nextLine());
			}
			//System.out.println(n1.size());
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public String random(){
		String word;
		int ran = (int)(Math.random()*5865);
		word = n1[ran];
		return word;
	}
	
	
}
