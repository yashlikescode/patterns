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
        for (int sp = 0; sp < i; sp++ )
        {
            printf(" ");
        }
        for (int st = 0; st < n - i; st++)
        {
            printf("*");
        }
        printf("\n");
    }
}
