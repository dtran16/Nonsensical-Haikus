import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * 4. rhyme/adjs/make sense
 * 5. UI
 * 
 *
 */
public class Gen {
	private String haiku = "";
	String line1 = "";
	String line2 = "";
	String line3 = "";
	public Gen(){
		
	}
	public void generate(){
		int rando;
		Noun1 noun1 = new Noun1();
		Noun2 noun2 = new Noun2();
		Noun3 noun3 = new Noun3();
		Noun4 noun4 = new Noun4();
		Verb1 verb1 = new Verb1();
		Verb2 verb2 = new Verb2();
		Verb3 verb3 = new Verb3();
		Verb4 verb4 = new Verb4();
		
		boolean isNoun = true;
		int syllables = 0;
		int line = 1;
		int maxSyllables = 0;
		char lastVowel1 = 's';
		String prevWord = "";
		while(line <= 3){
			if(line == 1){
				maxSyllables = 5;
			}else if(line == 2){
				maxSyllables = 7;
			}else if (line == 3){
				maxSyllables = 5;
			}
			if((maxSyllables-syllables)> 4){
				rando = (int)(Math.random() * 4) + 1;
			}else{
				rando = (int)(Math.random() * (maxSyllables - syllables)) + 1;
			}
			
			if(syllables >= 5 && line == 1){
				lastVowel1 = getLastVowel(prevWord);
				syllables = 0;
				line++;
				isNoun = true;
				
			}else if (syllables >= 7 && line == 2){
				syllables = 0;
				line++;
				isNoun = true;
			}else if (syllables >= 5 && line == 3){
				break;
			}
			if(isNoun){
				if(rando == 1){
					prevWord = noun1.random();
					if(line == 3 && getLastVowel(prevWord) != lastVowel1){
						
					}else{
						syllables += rando; 
						if(line == 1){
							line1 += prevWord + " ";
						}else if (line == 2){
							line2 += prevWord + " ";
						}else if (line == 3){
							line3 += prevWord + " ";
						}
						
					}
				}
				if(rando == 2){
					prevWord = noun2.random();
					if(line == 3 && getLastVowel(prevWord) != lastVowel1){
						
					}else{
						syllables += rando; 
						if(line == 1){
							line1 += prevWord + " ";
						}else if (line == 2){
							line2 += prevWord + " ";
						}else if (line == 3){
							line3 += prevWord + " ";
						}
					}
				}
				if(rando == 3){
					prevWord = noun3.random();
					if(line == 3 && getLastVowel(prevWord) != lastVowel1){
						
					}else{
						syllables += rando; 
						if(line == 1){
							line1 += prevWord + " ";
						}else if (line == 2){
							line2 += prevWord + " ";
						}else if (line == 3){
							line3 += prevWord + " ";
						}
					}
				}
				if(rando == 4){
					prevWord = noun4.random();
					if(line == 3 && getLastVowel(prevWord) != lastVowel1){
						
					}else{
						syllables += rando; 
						if(line == 1){
							line1 += prevWord + " ";
						}else if (line == 2){
							line2 += prevWord + " ";
						}else if (line == 3){
							line3 += prevWord + " ";
						}
					}
				}
				isNoun = !isNoun;
			}else{
				if(rando == 1){
					prevWord = verb1.random();
					if(line == 3 && getLastVowel(prevWord) != lastVowel1){
						
					}else{
						syllables += rando; 
						if(line == 1){
							line1 += prevWord + " ";
						}else if (line == 2){
							line2 += prevWord + " ";
						}else if (line == 3){
							line3 += prevWord + " ";
						}
					}
				}
				if(rando == 2){
					prevWord = verb2.random();
					if(line == 3 && getLastVowel(prevWord) != lastVowel1){
						
					}else{
						syllables += rando; 
						if(line == 1){
							line1 += prevWord + " ";
						}else if (line == 2){
							line2 += prevWord + " ";
						}else if (line == 3){
							line3 += prevWord + " ";
						}
					}
				}
				if(rando == 3){
					prevWord = verb3.random();
					if(line == 3 && getLastVowel(prevWord) != lastVowel1){
						
					}else{
						syllables += rando; 
						if(line == 1){
							line1 += prevWord + " ";
						}else if (line == 2){
							line2 += prevWord + " ";
						}else if (line == 3){
							line3 += prevWord + " ";
						}
					}
				}
				if(rando == 4){
					prevWord = verb4.random();
					if(line == 3 && getLastVowel(prevWord) != lastVowel1){
						
					}else{
						syllables += rando; 
						if(line == 1){
							line1 += prevWord + " ";
						}else if (line == 2){
							line2 += prevWord + " ";
						}else if (line == 3){
							line3 += prevWord + " ";
						}
					}
				}
				isNoun = !isNoun;
			}
			
			
		}
	}
		public char getLastVowel(String n){
			char vowel = 'a';
			n = n.toLowerCase();
			for(int i = 0; i < n.length(); i++){
				if(n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'u'){
					vowel = n.charAt(i);
				}
				
			}
			return vowel;
		}
		public String getLine1(){
			return line1;
		}
		public String getLine2(){
			return line2;
		}
		public String getLine3(){
			return line3;
		}
		
	
}
