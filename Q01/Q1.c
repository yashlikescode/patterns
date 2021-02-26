#include <stdio.h>
//making a right angle triangle with '*' facing downwards with hypotenuse towards left 
int main(void)
{
    printf("Enter height: ");
    int height = 0;
    scanf("%d", &height);
    for (int i = 0; i < height; i++) //for the height of triangle
    {
        for  (int p = 0; p < height - i; p++) //for the decreasing number of '*' 
        {
            printf("*");
        }
        printf("\n");//mandatory for going to the next line of pattern
    }
}
