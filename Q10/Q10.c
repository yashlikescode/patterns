#include <stdio.h>

int main(void) {
  printf("Enter Height\n");
  int height = 0;
  scanf("%d", &height);
  for (int i = 0; i < height; i++)
  {
    if (i == 0 || i == (height - 1))
    {
      for (int st1 = 0; st1 < height; st1++)
      {
        printf("*");
      }
      printf("\n");
    }
    else
    {
      printf("*");
      for (int st2 = 0; st2 < height - 2; st2++)
      {
        printf(" ");
      }
      printf("*");
      printf("\n");
    }
  }
  return 0;
}
