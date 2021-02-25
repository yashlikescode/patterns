#include<stdio.h>

void main()
{
    int n = 0;
    printf("Enter n: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++)
    {
        // return i for first half
        // return (n - i - 1) for second half
        int k = i <= n/2 ? i : (n - i - 1);

        // print k spaces
        // on first line there is zero space
        // on second line there is one space
        // and so on
        for(int j = 0; j < k; j++)
        {
            printf(" ");
        }

        // print *
        printf("*");

        // print odd number of spaces
        // the below logic can be easily obtained by simple maths
        for(int j = 0; j < (n - 2*(k+1)); j++)
        {
            printf(" ");
        }

        // ignore the second star when we center of loop
        if(n/2 != i)
            printf("*");

        // goto next line
        printf("\n");
    }
    
}