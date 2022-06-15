import random

symbols = ["$", "*", "@", "#", "%"]

def printPattern(rows):
    for rowIndex in range(rows):
        randomIndex = random.randint(0, len(symbols) - 1)
        for spaces in range(rows - rowIndex - 1):
            print(" ", end="")
        for symbol in range(2*rowIndex + 1):
            print(symbols[randomIndex], end="")
        for spaces in range(rows - rowIndex - 1):
            print(" ", end="")
        print()


if __name__ == '__main__':
    userInput = int(input("Number of Rows: "))
    printPattern(userInput)