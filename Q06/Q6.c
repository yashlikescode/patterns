#include <stdio.h>
#include <string.h>
#include <ctype.h>
//printing a pattern of upright isosceles triangle with '*'
int main (void)
{
    printf("Enter Height: ");
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++)//for the height of triangle
    {
        for (int sp = 0; sp < n-1-i; sp++)//for the required spacing
        {
            printf(" ");
        }
        for (int st = 0; st < 2*i+1; st++)//for the required number of '*' in each line
        {
            printf("*");
        }
        
        printf("\n");//mandatory for going to the next line
        
    }
}
