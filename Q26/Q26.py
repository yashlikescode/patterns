# Taking user input
n = int(input())

# Looping to print rows
for i in range(n):
    for j in range(i + 1):
        print(j + 1, end=" ")
    # Printing elements of the row
    print ()
