def patterns(n):
	f=1
	for i in range(n):
		j=n
		k=0
		while j>i:
			print(" ",end='')
			j-=1
		while k<f:
			print("*",end='')
			k+=1	
		f+=2
		print()

n=int(input())
patterns(n)


