import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Verb4 {
	private String[] n1;
	public Verb4(){
		try{
			File myFile = new File ("4syllableverbs.txt");
			Scanner in = new Scanner(myFile);
			n1 = new String[3986];
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
		int ran = (int)(Math.random()*3986);
		word = n1[ran];
		return word;
	}
	
	
}
