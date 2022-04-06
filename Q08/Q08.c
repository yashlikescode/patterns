#include<stdio.h>

int main()
{
    int len;
	printf("Enter width: ");
    scanf("%d",&len);
    int cnt = 1, t = 0 ;
    for(int i = 0 ; i < 2* len -1 ; i++ ){
        for(int j = 0; j < len - cnt ;j++) 
			printf(" ");
        for(int j = 0; j < cnt ;j++) 
			printf("*");
        if(cnt == len) t++;
        if(!t) cnt++;
        else cnt--;
        printf("\n");
    }
}