#include <stdio.h>
#include <string.h>
#include <ctype.h>

//for printing a pattern of '*' in a right angle triangle with hypotenuse towards the left
int main (void)
{
    printf("Enter Height: ");
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++)//for the height of the triangle
    {
        for (int sp = 0; sp < n-1-i; sp++)//for printing the spacing in making the hypotenuse
        {
            printf(" ");
        }
        for (int st = 0; st < i+1; st++)//for printing the line of '*'
        {
            printf("*");
        }
        printf("\n");//mandatory for going to the next line
    }
}
