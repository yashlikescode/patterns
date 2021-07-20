def pattern(n):
        for i in range(0,n):
                for j in range(0,i+1):
                        print(i*j , end=" ")
                print("\r")

n = int(input("Enter the n value : "))
pattern(n)
