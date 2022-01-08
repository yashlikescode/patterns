#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
/*
4 4 4 4
4 3 3 3  
4 3 2 2  
4 3 2 1
*/
int main() 
{

    int n;
    scanf("%d", &n);
    int s = 0;
  	for (int i = 0; i < n; i++) 
    {
        s = 0;
        for(int j = 0; j<n; j++)
        {
            printf("%d ",n-s);
            if(s<i)
                s+=1;
        }

        if(i==n-1)
            s = i-1;
        else
            s = i;  
        for(int j = 0; j<n-1; j++)
        {
            printf("%d ",n-s);
            if(j >= n-1-i-1)
                s-=1;
        }        
        printf("\n");
    }
    
    for (int i = n-2; i >= 0; i--) 
    {
        s = 0;
        for(int j = 0; j<n; j++)
        {
            printf("%d ",n-s);
            if(s<i)
                s+=1;
        }

        if(i==n-1)
            s = i-1;
        else
            s = i;  
        for(int j = 0; j<n-1; j++)
        {
            printf("%d ",n-s);
            if(j >= n-1-i-1)
                s-=1;
        }        
        printf("\n");
    }
}
