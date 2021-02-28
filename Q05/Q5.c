#include <stdio.h>
#include <string.h>
#include <ctype.h>
//printing a pattern of inverted isosceles triangle using '*'
int main (void)
{
    printf("Enter Height: ");
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++)//for height of triangle
    {
        for (int sp = 0; sp < i; sp++ )//for the required spacing
        {
            printf(" ");
        }
        for (int st = 0; st < 2*n-1-i*2; st++)//for printing the required number of '*' in each line
        {
            printf("*");
        }
        printf("\n");
    }
}
