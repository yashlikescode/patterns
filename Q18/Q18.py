# Taking user input
n = int(input())

# 0 = *
# 1 = .

# Looping to print rows
for i in range(n):
    indin = i % 2
    for i in range(n):
        if indin == 0:
            print("*",end = "")
            indin = 1
        else:
            print(".",end = "")
            indin = 0
    # Printing elements of the row
    print ()
