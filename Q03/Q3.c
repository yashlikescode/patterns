#include <stdio.h>
#include <string.h>
#include <ctype.h>

//for printing '*' in a pattern of upright right triangle with hypotenuse towards the right side 
int main (void)
{
    printf("Enter Height: ");
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++)//for the height of triangle
    {
        for (int st = 0; st < i + 1; st++)//for the number of '*' in each line
        {
            printf("*");
        }
        printf("\n");//mandatory for going to the next line of printing the pattern
    }
}
