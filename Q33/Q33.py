def printPattern(rows):
    for rowNum in range(rows):
        for colNum in range(rows):
            if rowNum % 2 == 0:
                print(rowNum * rows + colNum + 1, end=' ')
            else:
                print((rowNum + 1) * rows - colNum, end=' ')
        print()


if __name__ == '__main__':
    userInput = int(input("Number of Rows: "))
    printPattern(userInput)