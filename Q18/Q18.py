def Q18(rows):
    for i in range(0, rows):
        for j in range(0, rows):
            if i % 2 == j % 2:
                print("*", end = '')
            else:
                print(".", end = '')
        
        print()

Q18(5)