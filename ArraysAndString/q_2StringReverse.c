#include <stdio.h>
#include <stdlib.h>

void reverse(char *str){

	char *end;
	char temp;
	end = str;

	while(*end != '\0')
	{
		end++;
	}
				
		end--;
	while(end>str)
	{
		temp = *end;
		*end = *str;
		*str = temp;
		
		str++;
		end--;
		
	}



}


int main(){

char str[]  = "anurag";

reverse(str);
printf("%s",str);
return 0;
}