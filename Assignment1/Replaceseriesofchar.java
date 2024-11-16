package Assignment1;
import java.util.*;
public class Replaceseriesofchar {
 public static void main(String[] args) {
String st="This is chilled beer";
 
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter a word : ");
			String str  = sc.nextLine();
			String str1 = "";
			for(int i = 0; i< str.length(); i++) {
				char ch = str.charAt(i);
				if(str.length()-1 != i) {
					if(str.charAt(i) == str.charAt(i+1)) {
						ch = '@';
						i++;
					}
				}
				str1 = str1+ ch;
			}
			sc.close();
			System.out.println(str1);
		}
	 }
 
