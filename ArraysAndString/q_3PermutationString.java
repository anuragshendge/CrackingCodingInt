import java.util.*;
import java.io.*;



public class q_3PermutationString{


	private static boolean reverse(String str1, String str2){
	
		str1 =	sortString(str1);
		str2 =	sortString(str2);
		
		if(str1.length()!= str2.length())
			return false;
		
		return str1.equals(str2);
			
		
			
	}

	private static String sortString(String str) {
		
		char[] charArray = str.toCharArray();
		
		Arrays.sort(charArray);
		
		String strSorted = new String(charArray);
		return strSorted;
	}

	public static void main(String[] args){

		String str1 = "";
		String str2 = "";

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 1st String");
		str1 = scan.nextLine();
		System.out.println("Enter 2nd String");
		str2 = scan.nextLine();

		if(reverse(str1,str2))
		{
			System.out.println("Yes the two String are Permutations");
		}
		else
		{
			System.out.println("NO the two String are NOT Permutations");	
		}
		
		if(reverse_alternative(str1,str2))
		{
			System.out.println("Method2->Yes the two String are Permutations");
		}
		else
		{
			System.out.println("Method2->NO the two String are NOT Permutations");	
		}

	}

	private static boolean reverse_alternative(String str1, String str2) {
		
		int[] countStr1 = new int[128];
		int[] countStr2 = new int[128];
		
		for(int i=0; i< str1.length(); i++)
		{
			countStr1[(str1.charAt(i))]++;
			countStr2[(str2.charAt(i))]++;
			
		}
		
		for(int i=0; i<128; i++)
		{
			if(countStr1[i]!=countStr2[i])
				return false;
			
		}
		
		return true;
	}


}
