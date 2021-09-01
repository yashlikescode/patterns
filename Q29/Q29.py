# Taking user input
n = int(input())

# Declaring a number to be printed next
ind = 1;
# Setting length of the next 
row_len = 1;

# Looping to print rows
for i in range(n):
    # Looping to print elements of the row
    for j in range(row_len):
        print (str(ind) + " ", end = "")
        # Modifying the number to be printed after every print
        ind += 1
    # Modifying length of the row to be printed
    row_len += 2
    # Printing a new line after each row is printed
    print()
    
