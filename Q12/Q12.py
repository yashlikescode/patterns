def pattern(n):
	for i in range(1,n+1):

		for k in range(i):
			print(' ',end='')
			
		for j in range(1,n-i+2):
			print(j,end=' ')

		print()

n=int(input())
pattern(n)
