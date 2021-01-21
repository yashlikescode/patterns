def  pattern(n):
	for i in range(1,n+1):
		k=n
		while k>i:
			print(' ',end='')
			k-=1
		for j in range(1,i+1):
			print(j,end=' ')
		print()


n=int(input())
pattern(n)

