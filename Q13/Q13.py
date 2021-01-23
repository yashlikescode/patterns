# this code is for python versions 3.x

x = int(input("Enter number of row for the pattern : "))
i = 1
while i <= x:
    for j in range(x-i):
        print(" ", end =" ")
    for j in range(i):
        print(j +1, end =" ") # for python 2.7.x write print('*'),

    if i == 1:
        print("")
    else :
        for j in range(i-1,0,-1):
            if j == 0:
                continue
            else :
                print(j, end =" ") # for python 2.7.x write print('*'),
        print("")
    i+=1