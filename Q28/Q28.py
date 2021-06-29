rows = int(input("Enter number of rows for the pattern : "))
number = 1

for i in range(0, rows):     #This outer loop prints the rows
    for j in range(0, i + 1):    #This inner loop prints the columns
        print(number, end=" ")
        number = number + 1
    print()
