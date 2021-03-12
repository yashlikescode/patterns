

#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main (void)
{
    printf("Enter Height: ");
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        for (int sp = 0; sp < n-1-i; sp++)
        {
            printf(" ");
        }
        for (int st = 0; st < i+1; st++)
        {
            printf("*");
        }
        printf("  ");
        for (int st2 = 0; st2 < i+1; st2++)
        {
            printf("*");
        }
        printf("\n");

    }
}
