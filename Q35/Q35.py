# Solution here involves visualizing the relationship between the indices
# and the value that is printed on that position. If you print out the respective 
# indices in each position, you'll notice that one of the row/column indices can 
# be used to calculate what number should be printed.

def printPattern(numberInput):
    dimension = numberInput * 2 - 1
    for i in range(dimension):
        for j in range(dimension):
            x = i if i <= (numberInput - 1) else (2*(numberInput - 1)) % i
            y = j if j <= (numberInput - 1) else (2*(numberInput - 1)) % j
            amountToSubtract = x if x < y else y
            print(numberInput - amountToSubtract, end=' ')
        print()
        

if __name__ == '__main__':
    userInput = int(input("Number Input : "))
    printPattern(userInput)