#include <stdio.h>
#include <string.h>
#include <ctype.h>
//for printing '*' in a pattern of right angle triangle with hypotenuse towards the left side 
int main (void)
{
    printf("Enter Height: ");
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++)// for the height of triangle
    {
        for (int sp = 0; sp < i; sp++ )//for printing the spaces to make the hypotenuse towards left
        {
            printf(" ");
        }
        for (int st = 0; st < n - i; st++)//for printing * in decreasing order
        {
            printf("*");
        }
        printf("\n");//mandatory for going to the next line after each line of'*' 
    }
}
