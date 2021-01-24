def pattern(n):
	for i in range(n):
		j=0
		while j<i+1:
			print("*",end='')
			j+=1
		print()
	for i in range(n-1):
		j=n-1
		while j>i:
			print("*",end='')
			j-=1
		
		print()
	

n=int(input())
pattern(n)
