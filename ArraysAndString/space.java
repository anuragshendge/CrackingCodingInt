import  java.util.*;
import  java.io.*;


public class space{
	
	public static void main(String[] args){

		
		String str = "Anurag will X    ";
		int originalLen = str.length();

		char [] charArray = str.toCharArray();

		String resultString = SpaceInsert(charArray,originalLen,13);

		System.out.println(resultString);

	}	


	private static String SpaceInsert(char[] charArray, int originalLen, int realLen ){

		int extraSpace = originalLen - realLen;
		int totalSpace = 0;

		
		
		for(int i=0; i<originalLen;i++){
		
			if(charArray[i]== ' ')
				totalSpace++;
		}

		
		int spaceCount = totalSpace - extraSpace;
		int newLen = realLen + spaceCount*2;
		
		
		
		char[] newArray = new char[newLen];
		//System.out.println(charArray);
		
		int i=realLen-1;
		int j=newLen-1;

		while(i>=0 && j>=0){

			if(charArray[i]== ' '){

				newArray[j] = '0';
				newArray[--j] = '2';
				newArray[--j] = '%';
				
			}

			else{
				newArray[j] = charArray[i];
					
			}

			i--;
			j--;
		

		}
		
		String strResult = new String(newArray) ;
		return strResult;
	}



}