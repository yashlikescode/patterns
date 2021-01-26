# this code is for python versions 3.x

#prompting users to enter a number
x = int(input("Enter number of row for the pattern : "))

while x > 0:#if the users input greater than zero
    for i in range(x): #iterating through the users input
        print('*', end ="") # for python 2.7.x write print('*'),
    print("")
    x-=1 #decreasing the users input to reach the least number which is = 0