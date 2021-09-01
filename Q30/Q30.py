# Taking user input
n = int(input())

# Calculating half of the length of rows
len = 0;
for i in range(n-1):
    len += 2

pair = 0
# Looping to print rows
for i in range(n):
    # Printing elements of the row
    print ("*" * (len-(pair//2)) + "_" * pair + "*" * (len-(pair//2)))
    # Modifying the number of underscores to be printed in every row
    pair += 2
    
