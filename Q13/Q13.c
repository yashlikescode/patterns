#include<stdio.h>

int main()
{
    int len;
    scanf("%d",&len);
    int cnt = 1 , t = 0 ;
    for(int i= 0 ; i < len-1;i++)
		printf("  ");
    printf("1\n");
    for(int i = 1 ; i < len ; i++ ){
        for(int j = 0 ; j < len - i -1 ; j++) 
			printf("  ");
        int j;
        for( j = 1  ; j < i+1 ;j++)
			printf("%d ",j);
        while(j!=0)
			printf("%d ",j--);
        printf("\n");
    }
}
