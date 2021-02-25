#include <stdio.h>

int main(void)
{
    printf("Enter height: ");
    int height = 0;
    scanf("%d", &height);
    for (int i = 0; i < height; i++)
    {
        for  (int p = 0; p < height - i; p++)
        {
            printf("*");
        }
        printf("\n");
    }
}