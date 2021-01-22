# this code is for python versions 3.x

x = int(input("Enter number of row for the pattern : "))
i = 0
temp = x
while x > 0:
    for j in range(x):
        print('*', end ="") # for python 2.7.x write print('*'),

    print(' ', end ='')
    for j in range(i):
        print(" ", end = " ")
    for j in range(temp -i):
        print('*', end ="") # for python 2.7.x write print('*'),
    print("")
    i+=1
    x-=1

i = 1
x = temp
while i <= x:
    for j in range(i):
        print('*', end ="") # for python 2.7.x write print('*'),

    print(' ', end='')

    for j in range(2*(x-i)):
        print(" ", end ="")
    for j in range(i):
        print('*', end ="") # for python 2.7.x write print('*'),
    print("")
    i+=1