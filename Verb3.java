import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Verb3 {
	private String[] n1;
	public Verb3(){
		try{
			File myFile = new File ("3syllableverbs.txt");
			Scanner in = new Scanner(myFile);
			n1 = new String[6365];
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
		int ran = (int)(Math.random()*6365);
		word = n1[ran];
		return word;
	}
	
	
}
