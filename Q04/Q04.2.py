
def pattern(n):
	for i in range(n):
		j=n
		k=0
		while j>i+1:
			print(" ",end='')
			j-=1
		while k<i+1:
			print("*",end='')
			k+=1
		print()


print("give input for pattern")
n=int(input())
pattern(n)



