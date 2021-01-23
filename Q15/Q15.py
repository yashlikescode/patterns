
def pattern(n):
	for i in range(n):
		
		for k in range(i+1):
			print(' ',end='')
		for j in range(2*n-i*2):
			print("*",end='')

		print()


	for i in range(n):
		
		k=n
		while k>i:
			print(" ",end='')
			k-=1

		for j in range(2*i+2):
			print("*",end='')

		print()



n=int(input())
pattern(n)


