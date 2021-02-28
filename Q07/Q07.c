#include <stdio.h>
#include <string.h>
#include <ctype.h>
//for printing an isosceles triangle with the base towards left using '*'
int main (void)
{
    printf("Enter Height: ");
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++)//for the upper half of triangle
    {
        for (int st = 0; st < i + 1; st++)//for printing '*' in an increasing order
        {
            printf("*");
        }
        printf("\n");//mandatory for going tot the next line
        
    }
    for (int p = 0; p< n-1;p++)//for the lower half of the triangle
    {
        
        for (int st2 = 0; st2 < n - 1 - p; st2++)//for printing '*' in a decreasing order
        {
            printf("*");
        }
        printf("\n");//mandatory for going to the next line
    }
}
