#include <stdio.h>

int main(void) {
  printf("Enter Height\n");
  int height = 0;
  scanf("%d", &height);
  for (int i = 0; i < height; i++)
  {
    for (int sp = 0; sp < i; sp++)
    {
      printf(" ");//printing spaces
    }
    for (int st = 0; st < height - i; st++)
    {
      printf("%d ", (st+1));//printing the numbers
    }
    printf("\n");//printing new line after each row
  }
  return 0;
}
