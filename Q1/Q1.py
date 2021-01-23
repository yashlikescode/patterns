# this code is for python versions 3.x

x = int(input("Enter number of row for the pattern : "))

while x > 0:
    for i in range(x):
        print('*', end ="") # for python 2.7.x write print('*'),
    print("")
    x-=1