import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Noun2 {
	private String[] n1;
	public Noun2(){
		try{
			File myFile = new File ("2syllablenouns.txt");
			Scanner in = new Scanner(myFile);
			n1 = new String[22110];
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
		int ran = (int)(Math.random()*22110);
		word = n1[ran];
		return word;
	}
	
	
}
