import java.util.*;
import java.io.*;

	
public class q_1_1UniqueString{



	public static boolean isUnique(String word){

			boolean[] flag = new boolean[128];
			
			if(word.length()>128)
				return false;

			for(int i=0; i<word.length(); i++)
			{
				int val = word.charAt(i);
				if(flag[val])
					return false;
				flag[val] = true;

			}

			return true;

	}

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();

		System.out.println(word+"=>"+isUnique(word));

	}
}