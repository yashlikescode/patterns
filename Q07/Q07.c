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
        for (int st = 0; st < i + 1; st++)
        {
            printf("*");
        }
        printf("\n");
        
    }
    for (int p = 0; p< n-1;p++)
    {
        
        for (int st2 = 0; st2 < n - 1 - p; st2++)
        {
            printf("*");
        }
        printf("\n");
    }
}
